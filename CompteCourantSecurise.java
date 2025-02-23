

	public class CompteCourantSecurise<T> extends CompteCourant<T> implements Securisable {
	    private String identifiantSecurise;

	    public CompteCourantSecurise(int numeroCompte, double solde, T devise, double limiteNegatif, String identifiantSecurise) {
	        super(numeroCompte, solde, devise, limiteNegatif);
	        this.identifiantSecurise = identifiantSecurise;
	    }

	    @Override
	    public boolean verifierIdentite(String identifiant) {
	        return this.identifiantSecurise.equals(identifiant);
	    }
	    public void retirer(double montant, String identifiant) throws AccesInterditException {
	        if (!verifierIdentite(identifiant)) {
	            throw new AccesInterditException("Accès refusé : identifiant incorrect.");
	        }
	        super.retirer(montant);
	    }

}
