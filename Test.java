
public class Test {
	
	public static void main (String[] args) {
		
		int tab[][][] = new int[3][3][3];
		int tab2[] = {250,100,150};
		
		
		allouer(tab, tab2);
		
		affiche1(tab);
		System.out.println("------------");
		affiche2(tab);
		System.out.println("------------");
		affiche3(tab);
		System.out.println("------------");
		
		int [] tab1d = new int[3];
		
		System.out.println("--Exo1---");
		exo1(tab, tab2);
		affiche1(tab);
		System.out.println("------------");
		affiche2(tab);
		System.out.println("------------");
		affiche3(tab);
		System.out.println("------------");
		
		
		/*
		allouer2(tab, tab1d);
		desaturate(tab1d);
		
		allouer(tab, tab1d);
		affiche1d(tab1d);
		System.out.println("------------");
		affiche1(tab);
		System.out.println("------------");
		affiche2(tab);
		System.out.println("------------");
		affiche3(tab);
		System.out.println("------------");
		*/
		
		
	}
	
	public static void  affiche1d (int [] tab){
		for(int i = 0; i < tab.length; i++){
			System.out.println("[" + tab[i] +"]");
		}
	}
	
	public static void affiche1(int [][][] tab){
		for(int i = 0; i < tab.length; i++)
		{
			for(int j = 0; j < tab[i].length; j++)
			{
				for(int k = 0; k < 1; k++)
				{
					System.out.print("[" + tab[i][j][k]+ "]");
				}
			}
			System.out.println("");
		}
	}
	
	public static void affiche2(int [][][] tab){
		for(int i = 0; i < tab.length; i++)
		{
			for(int j = 0; j < tab[i].length; j++)
			{
				for(int k = 1; k < 2; k++)
				{
					System.out.print("[" + tab[i][j][k]+ "]");
				}
			}
			System.out.println("");
		}
	}
	
	public static void affiche3(int [][][] tab){
		for(int i = 0; i < tab.length; i++)
		{
			for(int j = 0; j < tab[i].length; j++)
			{
				for(int k = 2; k < 3; k++)
				{
					System.out.print("[" + tab[i][j][k]+ "]");
				}
			}
			System.out.println("");
		}
	}
	
	public static void allouer(int [][][] tab, int [] tab2){
		for(int i = 0; i < tab.length; i++)
		{
			for(int j = 0; j < tab[i].length; j++)
			{
				for(int k = 0; k < tab[i].length; k++)
				{
					tab[i][j][k] = tab2[k] ;
				}
			}
		}
	}
	
	public static void allouer2(int [][][] tab, int [] tab2){
		for(int i = 0; i < tab.length; i++)
		{
			for(int j = 0; j < tab[i].length; j++)
			{
				for(int k = 0; k < 3; k++)
				{
					tab2[k] = tab[i][j][k];
				}
			}
		}
	}
	
	public static void desaturate(int [] tab){
		
		/*
		int e = Math.min(tab[0], tab[1]);
		int f= Math.min(e, tab[2]);
		
		int g= Math.max(tab[0], tab[1]);
		int h = Math.max(g, tab[2]);
		*/
		
		//(int) ((e + h)/2);
		int a = (int)(Math.round(0.21 * tab[0]) + Math.round(0.72 * tab[1]) +Math.round(0.07 * tab[2])); 
		
		
		for(int i = 0; i < tab.length; i++){
			tab[i] = a;
		}
	
	}
	
	public static void exo1(int [][][] tab, int [] tab2){
		
		for(int i = 0; i < tab.length; i++)
		{
			for(int j = 0; j < tab[i].length; j++)
			{
				for(int k = 0; k < tab[i].length; k++)
				{
					tab2[k] = tab[i][j][k];
					desaturate(tab2);
					tab[i][j][k] = tab2[k];
				}
			}
		}
	}
	
	
		
	
	
	
	
	
	
}

