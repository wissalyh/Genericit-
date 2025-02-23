
public class CompteCourant<T> extends Compte<T> {
    private double limiteDecouvert;

    public CompteCourant(int numeroCompte, double solde, T devise, double limiteDecouvert) {
        super(numeroCompte, solde, devise);
        this.limiteDecouvert = limiteDecouvert;
    }

    @Override
    public void retirer(double montant) {
        if (montant > 0 && (super.getSolde() - montant) >= -limiteDecouvert) {
           solde -= montant;
            System.out.println("Retrait de " + montant + " " + super.getDevise() + " effectué.");
        } else {
            System.out.println("Retrait impossible. Dépassement de la limite autorisée.");
        }
    }

    @Override
    public void afficherSolde() {
        System.out.println("Compte Courant - Solde: " + super.getSolde() + " " +super.getDevise());
    }
    
} 


