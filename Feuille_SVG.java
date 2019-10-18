import java.util.*;
import java.io.*;

import java.util.ArrayList;

	public class Feuille_SVG{
		
		
		// nom (et lieu ou va s'ecrire le fichier) pas encore coder
		private String name_File;
		//private String direction_File;
		
		
		private Rectangle_SVG base;
	
		private ArrayList<String> feuille;
		
		private int width;
		private int height;
		private String title;
		private String description;
		
		
		
		/**
		 * Constructeur de la classe feuille , avec paramêtre
		 *@param width, height
		 */
		 public Feuille_SVG(String name_File, int width, int height, String title, String description){
			 
			 this.name_File = name_File;
			 //this.direction_File;
			 
			 this.width = width;
			 this.height = height;
			 this.title = title;
			 this.description = description;
			 
			Rectangle_SVG base = new Rectangle_SVG(this.width, this.height, 0,0, "white");
			
			this.feuille = new ArrayList<String>();
			
			String ligne1 = "<?xml version= \"1.0\" encoding= \"utf8\"?>";
			String ligne2 = "<svg xmlns= \"http: // www.w3.org/2000/svg\" version =\"1.1\" width= \""+ this.width +"\" height=\"" + this.height + "\">";
			String ligne3 = "<title>" + this.title + "</title>";
			String ligne4 = "<desc>" + this.description + "</desc>";
			String ligne5 = "</svg>";		
			 
			 // ajout des lignes correspondant au corps de la feuile au format SVG.
			 
			 this.feuille.add(ligne1);
			 this.feuille.add(ligne2);
			 this.feuille.add(ligne3);
			 this.feuille.add(ligne4);
			 this.feuille.add(base.toString());
			 this.feuille.add(ligne5);
		}
		/**
		 * Methode qui renvoi le nombre d'element inserer dans la feuille SVG
		 * @return int elements
		 */
		private int compteur(){
			int a = 0;
			
			for(int i= 0; i < this.feuille.size(); i++){
				if(this.feuille.get(i) != null)
				a++;
			}
			return a; 
		}
		
		/**
		 * insere un element dans la feuille this.size() -1
		 * 
		 */
		public void ajoutFormes(Formes a ){
			
			String s = a.toString();
			int z = compteur();
			z = z -1;
			this.feuille.add(z,s);
		}
		
		
		/**
		 * creer et insere un rectagle dans la feuille 
		 * @param pour le constructeur du rectangle
		 */
		 
		public void createRect(int width, int height, int posX, int posY, String fill){
			Rectangle_SVG rect = new Rectangle_SVG(width, height, posX, posY, fill);
			ajoutFormes(rect);
		}
		
		/**
		 * creer et insere un cercle dans la feuille
		 * @param pour le constructeur du cercle
		 */
		public void createCircle(int cX, int cY, int rayon, String color){
			Circle_SVG circle = new Circle_SVG(cX, cY, rayon, color);
			ajoutFormes(circle);
		}
		
		
		/**
		 * creer et insere une ligne dans la feuille
		 * @param pour le constructeur de la ligne
		 */
		public void createLine(int x1, int y1, int x2, int y2, String color, int stroke_width){
			Line_SVG line = new Line_SVG(x1,y1,x2,y2,color,stroke_width);
			ajoutFormes(line);
		}
		
		/**
		 * creer et insere un text dans la feuille
		 * @param pour le constructeur du text
		 */
		public void createText(int x, int y, int fontSize, String texte){
			
			Text_SVG text = new Text_SVG(x,y,fontSize,texte);
			ajoutFormes(text);
		}
		 
		/**
		 * creer un feuille svg en lisant le contenu de this.feuille.
		 * (fichier de sortie par default)
		 * 
		 */
		public void printFeuille(){
				try{
					PrintWriter sortie = new PrintWriter(new FileOutputStream(this.name_File +".svg"));
			
					for(int i = 0; i < this.feuille.size(); i++){
						sortie.println(this.feuille.get(i));
					}
			
					sortie.close();
				}catch(IOException e){
					System.out.println(e);
				}
		}
		
		/**
		 *Affiche le contenu de this.feuille sans l'imprimer 
		 * utiliser pour controler le contenu de this.feuille avant imprssion 
		 */
		public void affiche(){
			
			for(int i= 0; i < this.feuille.size(); i++){
					System.out.println(this.feuille.get(i));
				
			} 
		}
		
		
		
		
		
		
		
		 
	}
