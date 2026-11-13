package tp2;

public class Etudiant extends Personne { //relation d´heritage
	//atributs
	private String cne;
	private String filiere;
	private int niveau;
	
	//constructeurs
	public Etudiant(String nom,String prenom,Date dn ,String cne,String filiere,int niveau) {
		super(nom,prenom,dn); //elle fait la reference avec les constructeurs de la classe mère personne , must be the first thing!
		this.filiere=filiere;
		this.niveau=niveau;
		this.cne=cne;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public String toString() {
		return "Etudiant ["+super.toString()+",cne=" + cne + ", filiere=" + filiere + ", niveau=" + niveau+"]";
	}
	

}
