package revision;

import java.util.ArrayList;



public class Equipe {
	public String nom;
	public String ville;
	public Entreneur entreneur;
	public ArrayList<Joueur> listeJoueur;
	
public Equipe(String nom,String ville) {
	this.nom=nom;
	this.ville=ville;
	this.entreneur=new Entreneur("achour","douae",new Date1(17,04,2005),"football",0);
	this.listeJoueur=new ArrayList<>();
}
public Equipe(String nom,String ville,Entreneur entreneur) {
	this.nom=nom;
	this.ville=ville;
	this.entreneur=entreneur;
	this.listeJoueur=new ArrayList<>();
}
public Equipe(String nom,String ville,Entreneur entreneur,ArrayList<Joueur> joueur) {
	this.nom=nom;
	this.ville=ville;
	this.entreneur=entreneur;
	this.listeJoueur=joueur;
}
public Equipe(String nom,String ville,Entreneur entreneur,Joueur...joueur) {
	this.nom=nom;
	this.ville=ville;
	this.entreneur=entreneur;
	this.listeJoueur=new ArrayList<>();
	for(Joueur J:joueur)
		listeJoueur.add(J);
}
public void AjouterJoueur(Joueur joueur) {
	listeJoueur.add(joueur);
}
public void SupprimerJoueur(Joueur joueur) {
	listeJoueur.remove(joueur);
}
public String getNom() {
	return nom;
}
public void setNom(String nom ) {
	this.nom=nom;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville=ville;
}
public Entreneur getEntreneur() {
	return entreneur;
}
public void setEntreneur(Entreneur entreneur) {
	this.entreneur=entreneur;
}
public ArrayList<Joueur> getListeJoueur(){
	return listeJoueur;
}
public String toString() {
	return "equipe :[ Nom:"+nom+"| ville:"+ville+"| Entreneur :"+entreneur.toString()+"| Liste de joueur {"+listeJoueur.size()+"} :"+listeJoueur+"]";
}
}
