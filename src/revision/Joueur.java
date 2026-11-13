package revision;

public class Joueur extends Personne1{
	public String numeroLicence;
	public String poste;
	public int numeroMaillot;
	
public Joueur(String nom,String prenom,Date1 d,String numeroLicence,String poste,int numeroMaillot) {
	super(nom,prenom,d);
	this.numeroLicence=numeroLicence;
	this.poste=poste;
	this.numeroMaillot=numeroMaillot;
}
public void setNumeroLicence(String numeroLicence) {
	this.numeroLicence=numeroLicence;
}
public String getNumeroLicence() {
	return numeroLicence;
}
public void setPoste(String poste) {
	this.poste=poste;
}
public String getPoste() {
	return poste;
}
public void setNumeroMaillot(int numeroMaillot) {
	this.numeroMaillot=numeroMaillot;
}
public int getNumeroMaillot() {
	return numeroMaillot;
}
public String toString() {
	return "joueur:"+super.toString()+"|"+numeroLicence+"|"+poste+"|"+numeroMaillot ;
}
}
