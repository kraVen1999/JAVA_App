

public class Rectangle_SVG extends Formes{
	
	private int width;
	private int height;
	
	private int posX;
	private int posY;
	
	private String fill;
	
	
	/**
	 * Constructeur de la classe rectangle  avec paramêtres
	 * ces parametres reprennent la syntaxe svg pour editer un rectangle.
	 * 
	 * @param int width, int height, int posX, int posY, String fill
	 */
	public Rectangle_SVG(int width, int height, int posX, int posY, String fill){
		
		this.width = width;
		this.height = height;
		this.posX = posX;
		this.posY = posY;
		this.fill = fill;
	}
	
	/**
	 * Acesseur
	 */
	
	public int getWidth(){ return this.width;}
	public int getHeight(){ return this.height;}
	public int getPosX(){return this.posX;}
	public int getPosY(){return this.posY;}
	public String getFill(){return this.fill;}
	
	
	/**
	 * Mutateurs
	 */
	public void setWidth(int width){ this.width = width;}
	public void setHeight(int height){ this.height = height;}
	public void setPosX(int posX){this.posX = posX;}
	public void setPosY(int posY){this.posY = posY;}
	public void setFill(String fill){this.fill = fill;}
	
	
	/**
	 * Renvoi une String avec les paramêtre du rectangle
	 * @param void  
	 */
	 
	 public String toString(){	 
		 return "<rect width=\""+ this.width + "\" height =\"" + this. height + "\" x =\"" + this.posX + "\" y= \"" + this.posY + "\" fill =\"" + this .fill + "\"/>";
	 }
	
		
	
	
}
