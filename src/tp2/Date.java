package tp2;

public class Date {

	public int jour;
	public int mois;
	public int annee;
	/*public int jour; c´est faux */

public Date(int jour , int mois , int annee)
{
	this.jour=jour; /*this. -> modifier l´attribut,souvent utilisé lorsqu´il y a un conflit */
	this.mois=mois;
	this.annee=annee;
}

public String toString() {
	if (0<jour && jour<=31 && 0<mois && mois<=12)
		return jour+"/"+mois+"/"+annee;
	else
		return "saisir une date valide";
}
public void setJour(int jour) {
	
this.jour=jour;
}

public int getMois() {
	return mois;
}

public void setMois(int mois) {
	this.mois = mois;
}

public int getAnnee() {
	return annee;
}

public void setAnnee(int annee) {
	this.annee = annee;
}

public int getJour() {
	return jour;
}

}
