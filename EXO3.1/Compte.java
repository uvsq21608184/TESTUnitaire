
/**
 * Write a description of class Compte here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Compte {
	private double solde;
	private double credit;
	public Compte(double solde) throws IllegalArgumentException {
		this.solde=solde;
		if(solde<0){
			throw new IllegalArgumentException();
		}
	}
	public double getSolde() {
		return solde;
	}
	public void Virement(double virement,Compte compte) throws IllegalArgumentException {
		if(virement > this.solde || virement < 0){
			throw new IllegalArgumentException();
		}
		this.debit(virement);
		compte.credit(virement);
	}
	public void credit(double montant)throws IllegalArgumentException{
	    if(montant<=0){
			throw new IllegalArgumentException();
		}
		this.solde+=montant;
	}
	public void debit(double montant)throws IllegalArgumentException{
	    if(montant>this.solde){
			throw new IllegalArgumentException();
		}
		this.solde-=montant;
	}
	
	public void  afficheSold(){
		System.out.println(getSolde());
	}
}
