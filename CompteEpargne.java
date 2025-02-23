
class CompteEpargne<T> extends Compte<T> {
    private double tauxInteret;

    public CompteEpargne(int numeroCompte, double solde, T devise, double tauxInteret) {
        super(numeroCompte, solde, devise);
        this.tauxInteret = tauxInteret;
    }

    public void calculerInteret() {
        solde =super.getSolde()+ super.getSolde() * tauxInteret;
    }

    @Override
    public void afficherSolde() {
        System.out.println("Compte Épargne - Solde: " + super.getSolde() + " " + super.getDevise());
    }
}