package tp2;

public class Personne {
	public String nom;
	private String prenom;
	protected Date datedenaissance;
	int age; //acces dans tout le package
//constructeurs
public Personne(String nom, String prenom, Date dn) {
	this.nom=nom;
	this.prenom=prenom;
	this.datedenaissance=dn;
}
public Personne() {
	this.nom="sans nom";
	this.prenom="sans prenom";
	this.datedenaissance=new Date(11,04,2005);
}
public Personne(String nom, String prenom,int a,int b,int c) {
	this.nom=nom;
	this.prenom=prenom;
	this.datedenaissance=new Date(a,b,c);
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Date getDatedenaissance() {
	return datedenaissance;
}
public void setDatedenaissance(Date datedenaissance) {
	this.datedenaissance = datedenaissance;
}
public String toString() {
	return "Personne: nom=" + nom + ", prenom=" + prenom + ", datedenaissance=" + datedenaissance ;
}

	

}
