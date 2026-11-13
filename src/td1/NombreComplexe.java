package td1;

public class NombreComplexe {
	
	public float r ;
	private float img;
	
public NombreComplexe() { /*constructeur*/
	r=1;
	img=1;
}

public NombreComplexe(float x) {  /*constructeur*/
	r=img=x;
}
	/*liste des methodes*/

   /*pour modifier une information privée*/

	public float getR() { 
	return r;
	}
	public float getImg() { 
		return img;
	}
	public void setR(float x)
	{
		r=x;
	}
	public void setImg(float x)
	{
		img=x;
	}
	/*****/
	public String toString() { /*afficher*/
		

		if (img>=0) 
			return r +"+"+img+"i";
		else
			return r+"-"+img+"i";
	}
	public NombreComplexe somme(NombreComplexe B) {
		
		NombreComplexe resultat= new NombreComplexe();
		resultat.r= r+B.r;
		resultat.img=img+B.img;
		
		return resultat;
		
	}
	int somme(int [] t)
	{
		int rep=0;
		for(int i=0;i<t.length;i++)
			rep=rep+t[i];
		return rep;
	}
	
	public void multiplication(NombreComplexe B) {
		
		float reel=(r*B.r)-(img*B.img);
		float imaginaire=(r*B.img)+(img*B.r);
		
		System.out.println(reel + " + " + imaginaire + "i");
	}
	
	public NombreComplexe(float a , float b) {
		
		r=a;
		img=b;
	}
	
	public void afficher() {
		
		if (img>=0) 
			System.out.println(r +"+"+img+"i");
		else
			System.out.println(r+"-"+img+"i");
	
	}
}
