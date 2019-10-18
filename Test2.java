public class Test2{
	
	public static void main (String args[]){
		
		int tab[][] = new int[3][3];
		affiche(tab);
		System.out.println("--------------");
		
		
		allouer(tab);
		affiche(tab);
		
		System.out.println("--------------");
		
		int tab3[][] = new int[2][2];
		allouer(tab3);
		
		affiche(tab3);
		
		System.out.println("--------------");
		
		int[] tab2 = { 1,1,2,2,1,1,2,2,3,3,4,4,3,3,4,4};
		int tab4[][] = new int[4][4];
		allouer2(tab4, tab2);
		affiche(tab4);
		
		System.out.println("--------------");
		int tab5[][] = new int[4][4];
		int []a = algoAgr(tab3);
		affiche(tab5);
	}
	
	public static void affiche(int [][] tab){
		
		for(int i = 0; i < tab.length; i++){
			for(int j = 0; j < tab[i].length; j++){
				System.out.print("["+tab[i][j]+"]");
			}
			System.out.println("");
		}
	}
	
	public static void allouer(int [][] tab){
		
		int k = 1;
		for(int i = 0 ; i  < tab.length; i++){
			for(int j = 0; j  < tab[i].length; j++){
				
				tab[i][j]= k;
				k++;
			}
		}
	}
	
	public static void allouer2(int [][] tab, int[]tab2){
		
		int k = 0;
		for(int i = 0 ; i  < tab.length; i++){
			for(int j = 0; j  < tab[i].length; j++){
				
				tab[i][j]= tab2[k];
				k++;
			}
		}
	}
	
	public static int [] algoAgr(int [][] tabP){
		
		int[]  a = new int [4]; 
		
		for(int i = 0; i < tabP.length; i++){
			for(int j = 0; j < tabP[i].length; j++){
				
				 a[i]= tabP[i][j];
			}
		}
		return a;
	}
	
	public static void premierInd(int [][] tabG, int [] a){
		for( int  i = 0 ; i < tabG.length;  i +=2){
			for(int j = 0; j < tabG[i].length; j ++){
				
				tabG[i][j]= a[i];
				
			}
		}
		
	}
}
