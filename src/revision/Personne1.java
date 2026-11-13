package revision;

public class Personne1 {
		public String nom;
		public String prenom;
		public Date1 dateNaissance;
		
	public Personne1(String nom,String prenom,Date1 dn) {
		this.nom=nom;
		this.prenom=prenom;
		this.dateNaissance=dn;
	}

	public Personne1(String nom,String prenom,int jour,int mois,int annee) {
		this.nom=nom;
		this.prenom=prenom;
		this.dateNaissance=new Date1(jour,mois,annee);
	}
	public String toString() {
		return "Personne:"+nom+""+prenom+"|"+dateNaissance;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public String getNom() {
		return nom;
	}
public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setDate(Date1 dateNaissance) {
		this.dateNaissance=dateNaissance;
	}
	public Date1 getDate() {
		return dateNaissance;
	}
	}

