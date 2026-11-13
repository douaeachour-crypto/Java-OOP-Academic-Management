package revision;
import java.util.ArrayList;

public class Main {

	public void testerPersonne1() {
		Date1 date=new Date1(17,04,2005);
		System.out.println(date.toString());
		
		Personne1 p1=new Personne1("achour","douae",new Date1(17,04,05));
		Personne1 p2=new Personne1("achour","soufiane",2,3,1998);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
	public void testerJoueur() {
		Joueur j1=new Joueur("hakimi","achraf",new Date1(22,11,1997),"D4GF1","attaquant",7);
		System.out.println(j1.toString());
		j1.setNom("alami");
		j1.getDate().setJour(14);
		System.out.println(j1.toString());
	}
	public void testerEntreneur() {
		Entreneur e1=new Entreneur("achour","mohammed",new Date1(2,9,1975),"entreneur",10);
		System.out.println(e1.toString());
	}
	public void testerEquipe() {
		Equipe equip1=new Equipe("codm","meknes");
		System.out.println(equip1.toString());
		Entreneur e1=new Entreneur("achour","mohammed",new Date1(2,9,1975),"entreneur",10);
		Equipe equip2=new Equipe("fath","rabat",e1);
		System.out.println(equip2.toString());
		Joueur j1=new Joueur("hakimi","achraf",new Date1(22,11,1997),"D4GF1","attaquant",7);
		Joueur j2=new Joueur("ziyach","hakim",new Date1(15,10,1999),"GHJ70","attaquant",4);
		Equipe equip3=new Equipe("nationale","maroc",e1,j1,j2);
		System.out.println(equip3.toString());
		equip3.SupprimerJoueur(j1);
		System.out.println(equip3); // 1 joueur restant
		equip3.AjouterJoueur(j1);
		System.out.println(equip3);
		ArrayList<Joueur> liste = new ArrayList<>();
		liste.add(j1);
		liste.add(j2);
		Equipe equip4=new Equipe("ouidad","casa",e1,liste);
		System.out.println(equip4.toString());
	}
	public static void main(String[] args) {
		Main obj=new Main();
		obj.testerEntreneur();
		obj.testerJoueur();
		obj.testerEquipe();
	}

}
