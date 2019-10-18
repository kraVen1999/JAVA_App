

public class Text_SVG extends Formes{
	
	
	// coordonnées du text
	private int x;
	private int y;
	
	private int fontSize;
	private String texte;
	
	
	public Text_SVG(int x, int y, int fontSize, String texte){
		
		this.x = x;
		this.y = y;
		this.fontSize = fontSize;
		this.texte = texte;
		
	}
	
	// Accesseurs
	public int getXtext(){return this.x;}
	public int getYtext(){return this.y;}
	public int getTextFontSize(){return this.fontSize;}
	public String getTexte(){return this.texte;}

	//Mutateurs
		
	public void setXtext(int x){this.x = x;}
	public void setYtext(int y){this.y = y;}
	public void setFontSize(int fontSize){this.fontSize = fontSize;}
	public void setTexte(String texte){this.texte = texte;}
	
	
	public String toString(){
		return " <text x =\""+this.x +"\" y=\""+this.y+"\" font-size=\""+this.fontSize + "\">"+ this.texte +"</text>";
	}
	
}
