
public class Compte <T>{
private int numeroCompte;
protected double solde;
private T devise;
public Compte(int numeroCompte, double solde, T devise) {
	super();
	this.numeroCompte = numeroCompte;
	this.solde = solde;
	this.devise = devise;
}
public int getNumeroCompte() {
	return numeroCompte;
}
public void setNumeroCompte(int numeroCompte) {
	this.numeroCompte = numeroCompte;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public T getDevise() {
	return devise;
}
public void setDevise(T devise) {
	this.devise = devise;
}
public void deposer(double montant) {
   
        solde =solde+ montant;
        System.out.println("Dépôt de " + montant + " " + devise + " effectué.");
   
}

public void retirer(double montant) {
    if ( montant <= solde) {
        solde =solde- montant;
        System.out.println("Retrait de " + montant  + " est effectué.");
    } else {
        System.out.println(" Solde insuffisant.");
    }
}

public void afficherSolde() {
    System.out.println("Compte - Solde: " + solde + " " + devise);
}
public static <T> void transferer(Compte<T> source, Compte<T> destination, double montant) {
    if (source.solde >= montant) {
        source.retirer(montant);
        destination.deposer(montant);
        System.out.println("Transfert réussi.");
    } else {
        System.out.println("impossible de transferer");
}
}
}
