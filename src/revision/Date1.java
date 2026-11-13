package revision;

	public class Date1 {
		public int jour;
		public int mois;
		public int annee;
		
	public Date1(int jour, int mois,int annee) {
		this.jour=jour;
		this.mois=mois;
		this.annee=annee;
	}
	public String toString() {
		if(jour<=0 || jour>31 || mois<=0 || mois>12)
		{
			return "date invalide" ;
		}else {
			return jour+"/"+mois+"/"+annee;
		}
	}
	public void setJour(int jour) {
		this.jour=jour;
	}
	public int getJour() {
		return jour;
	}
	public void setMois(int mois) {
		this.mois=mois;
	}
	public int getMois() {
		return mois;
	}
	public void setAnnee(int annee) {
		this.annee=annee;
	}
	public int getAnnee() {
		return annee;
	}
	}

