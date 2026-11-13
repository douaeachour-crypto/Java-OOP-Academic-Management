package td1;

public class main {

	public static void main(String[] args) {
		System.out.println("bonjour ,je commence la poo");
		
		NombreComplexe A= new NombreComplexe(5);
		NombreComplexe B=new NombreComplexe(1,4);
		NombreComplexe C = new NombreComplexe();
		
		A.afficher();
		B.afficher();
		C=A.somme(B);
		C.afficher();
		
		/*afficher*/
		System.out.println(A.toString()); 
		System.out.println(B.toString());
		System.out.println(C.toString());
		
		A.multiplication(B);
		
		A.setR(20);
		A.setImg(30);
		System.out.println(A.getR());
		System.out.println(A.getImg());
		
		/* !A.NombreComplexe(); : on ne peut pas appeler le constructeur une 2eme fois,sera accepté ssi on a indiquer le type de retour pour la rendre une methode*/

	}

}
