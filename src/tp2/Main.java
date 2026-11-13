package tp2;
import java.util.ArrayList;
import polymorphisme.EquipeFoot;
public class Main {

		void testerPersonne()
		{
		Date date= new Date(17,4,2005);
		System.out.println(date.toString());
		/*System.out.println() syso ctr+esp*/;
		
		Personne p1= new Personne ("achour","douae",new Date(22,4,2005));
		Personne p2= new Personne ();
		Personne p3=new Personne("achour","douae",5,4,2005);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());	//system.out.println(p3); 
		}
		void testerEtudiant() {
			Etudiant e1=new Etudiant("achour","douae",new Date(22,4,2005),"M1410166","ilia",1);
			System.out.println(e1.toString());
			e1.setNom("kamal");
			e1.getDatedenaissance().setJour(23);
			System.out.println(e1.toString());
		}
		void testerProfesseur() {
			Professeur p1=new Professeur("achour","med",new Date(25,7,2000),"math","ensaf","analyse");
			System.out.println(p1.toString());
		}
		void testerFiliere() {
			Professeur p1=new Professeur("achour","med",new Date(25,7,2000),"math","ensaf","analyse");
			Etudiant e1=new Etudiant("dehbi","douae",new Date(22,11,2005),"M1410166","ilia",1);
			Etudiant e2=new Etudiant("achour","douae",new Date(17,4,2005),"M1410166","3iacn",1);
			Etudiant e3=new Etudiant("basil","aya",new Date(9,8,2005),"M1410166","isdia",1);
			Filiere f1=new Filiere("ilia","informatique");
			Filiere f2=new Filiere("ilia","informatique",p1,e1);
			Filiere f3=new Filiere("ilia","informatique",p1,e1,e2,e3);
			System.out.println(f1.toString());
			System.out.println(f2.toString());
			System.out.println(f3.toString());
		}
		void testerEquipe() {
			Etudiant etu1=new Etudiant("etud1","douae",new Date(22,11,2005),"M1410166","ilia",1);
			Etudiant etu2=new Etudiant("achour","douae",new Date(17,4,2005),"M1410166","3iacn",1);
			Etudiant etu3=new Etudiant("basil","aya",new Date(9,8,2005),"M1410166","isdia",1);
			Etudiant etu4=new Etudiant("basil","aya",new Date(9,8,2005),"M1410166","isdia",1);
			
			Professeur prof1=new Professeur("achour","med",new Date(25,7,2000),"math","ensaf","analyse");
			Professeur prof2=new Professeur("achour","med",new Date(25,7,2000),"math","ensaf","analyse");
			Professeur prof3=new Professeur("achour","med",new Date(25,7,2000),"math","ensaf","analyse");
			ArrayList<Personne> maliste=new ArrayList<Personne>();
			
			EquipeFoot equip1=new EquipeFoot("nassr");
			EquipeFoot equip3=new EquipeFoot("fath",etu1,prof2,prof3,etu2,prof1,etu3,etu4);
			EquipeFoot equip4=new EquipeFoot("Victoire",maliste);
			
			equip3.AjouterJoueur(etu1);
			
			
			
			
		}
public static void main(String[] args) {
	Main obj=new Main();
	//obj.testerDate();
	//obj.testerPersonne();
	obj.testerEtudiant();
	obj.testerProfesseur();
	obj.testerFiliere();
	obj.testerEquipe();
}
}