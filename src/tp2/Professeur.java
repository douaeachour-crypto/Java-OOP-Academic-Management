package tp2;

public class Professeur extends Personne{
	String specialite;
	String etablissement;
	String matiere;
public Professeur(String nom,String prenom,Date dn ,String specialite,String etablissement,String matiere) {
	super(nom,prenom,dn); //elle fait la reference avec les constructeurs de la classe mère personne , must be the first thing!
	this.specialite=specialite;
	this.etablissement=etablissement;
	this.matiere=matiere;
}
public String getSpecialite() {
	return specialite;
}
public void setSpecialite(String specialite) {
	this.specialite = specialite;
}
public String getEtablissement() {
	return etablissement;
}
public void setEtablissement(String etablissement) {
	this.etablissement = etablissement;
}
public String getMatiere() {
	return matiere;
}
public void setMatiere(String matiere) {
	this.matiere = matiere;
}
public String toString() {
	return "Professeur ["+super.toString()+",specialite=" + specialite + ", etablissement=" + etablissement + ", matiere=" + matiere + "]";
}
}
