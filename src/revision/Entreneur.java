package revision;

public class Entreneur extends Personne1 {
	public String specialite;
	public int anneeExperiences;
	
public Entreneur(String nom, String prenom, Date1 dn,String specialite, int anneeExperience) {
	super(nom,prenom,dn);
	this.specialite=specialite;
	this.anneeExperiences=anneeExperience;
}
public void setSpecialite(String specialite) {
	this.specialite=specialite;
}
public String getSpecialite() {
	return specialite;
}
public void setAnneeExperience(int anneeExperiences) {
	this.anneeExperiences=anneeExperiences;
}
public int getAnneeExperience() {
	return anneeExperiences;
}
public String toString() {
	return "entreneur"+super.toString()+"|"+specialite+"|"+anneeExperiences;
}

}
