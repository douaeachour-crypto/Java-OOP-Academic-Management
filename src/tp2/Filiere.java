package tp2;

import java.util.ArrayList;

public class Filiere {
	private String Nom;
	private String dep;
	private Professeur responsable;
	private ArrayList<Etudiant> listeEtudiants;
	int compteur=1;
	
	//constructeurs
public Filiere(String Nom,String dep) {
	this.Nom=Nom;
	this.dep=dep;
	this.responsable=new Professeur("ACHOUR", "Douae", new Date(17,04,2005), "sansspe","Sanseta", "Sansmat");
	this.listeEtudiants = new ArrayList<>();
}
public Filiere(String Nom,String dep,Professeur responsable) {
	this.Nom=Nom;
	this.dep=dep;
	this.responsable=responsable;
	this.listeEtudiants = new ArrayList<>();
}
public Filiere(String Nom,String dep,Professeur responsable,ArrayList<Etudiant> listeEtudiants) {
	this.Nom=Nom;
	this.dep=dep;
	this.responsable=responsable;
	this.listeEtudiants = listeEtudiants;
}
public Filiere(String Nom,String dep,Professeur responsable,Etudiant ...t) {
	this.Nom=Nom;
	this.dep=dep;
	this.responsable=responsable;
	this.listeEtudiants=new ArrayList<>();
	/*for(int i =0;i<t.length;i++)
	{
		listeEtudiants.add(t[i]);
	}*/
	for(Etudiant etu:t)
	{
		if(listeEtudiants.contains(etu))
		listeEtudiants.add(etu);
	}
		
}

//ajouter un etudiant
public void ajouterEtudiant(Etudiant etudiant) {
    listeEtudiants.add(etudiant);
}
//supprimer un etudiant
public void supprimerEtudiant(Etudiant etudiant) {
    listeEtudiants.remove(etudiant);
}
//stters and getters
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	this.Nom=nom;
}
public String getDep() {
	return dep;
}
public void setDep(String dep) {
	this.dep = dep;
}
public Professeur getResponsable() {
	return responsable;
}
public void setResponsable(Professeur responsable) {
	this.responsable = responsable;
}
public ArrayList<Etudiant> getListeEtudiants() {
	return listeEtudiants;
}
//tostring
public String toString() {
	return "Filiere : [Nom=" + Nom + ",\ndep=" + dep + ", \nresponsable=" + responsable.toString() + ", \nlisteEtudiants=("+listeEtudiants.size()+")"+ "\n " 
			  
			+"\n"+ listeEtudiants+ "]";
}

	
}

