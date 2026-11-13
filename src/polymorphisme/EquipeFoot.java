package polymorphisme;

import tp2.Personne;
import tp2.Etudiant;
import tp2.Professeur;
import java.util.ArrayList;


public class EquipeFoot{
	 String nom;
	 ArrayList<Personne> Joueurs;
	 ArrayList<Etudiant> Etudiant;
	 
	 public EquipeFoot(String nom) {
		 this.nom= nom;
		 this.Joueurs=new ArrayList<>();
	 }
	 
	 public EquipeFoot(ArrayList<tp2.Etudiant> etudiant) {
		super();
		Etudiant = etudiant;
	}
	 
	 
	 public EquipeFoot(String nom, ArrayList<Personne> joueurs) {
		super();
		this.nom = nom;
		Joueurs = joueurs;
	 }
	 public EquipeFoot(String nom,Personne ...tab) {
		 
		 super();
		 this.nom=nom;
		 //this.Joueurs=new ArrayList<Personne>(Arrays.asList(tab));
		 for(Personne p:tab) {
			 if(this.Joueurs.contains(p)==false)
				 this.Joueurs.add(p);
		 }
	 }
	 public String getNom() {
		 return nom;
	 }
	 public void setNom(String nom) {
		 this.nom=nom;
	 }
	 public ArrayList<Personne> getJoueurs(){
		 return Joueurs;
	 }
	 public ArrayList<Etudiant> getEudiant(){
		 ArrayList<Etudiant> liste= new ArrayList();
		 for(Personne p: Joueurs) {
			 if(p instanceof Etudiant) {
				 liste.add((Etudiant) p);
			 }
		 }
		 return liste; 
	 }
	 
	 public ArrayList<Professeur> getProfesseur(){
		 ArrayList<Professeur> liste=new ArrayList();
		 for(Personne prof :Joueurs) {
			 if(prof instanceof Professeur) {
				 liste.add((Professeur) prof);
			 }
		 }
		 return liste;
	 }
	 
	 public void AfficherEtudiant() {
		 System.out.println("les eudiants membres de l´equipe sont:");
		 for(Etudiant e:getEudiant()) {
				 System.out.println("\t-"+e);
		 }
	 }
	 public void AjouterJoueur(Personne p) {
		 if(!this.Joueurs.contains(p)) {
			 this.Joueurs.add(p);
		 }
	 }

	 @Override
	 public String toString() {
		return "EquipeFoot [nom=" + nom + ", Joueurs=" + Joueurs + ", Etudiant=" + Etudiant + "]";
	 }
	 
	 
	 
	 
	 //constructeur
	 
	 
}
