public class Line_SVG extends Formes{
	
	// point d'origine de la ligne
	private int x1;
	private int y1;
	
	// point d'arriver de la ligne 
	
	private int x2;
	private int y2;
	
	private String color;
	
	
	// epaisseur de la ligne
	private int stroke_width;
	
	public Line_SVG(int x1, int y1, int x2, int y2, String color, int stroke_width){
		this.x1 = x1;
		this.y1 = y1;
		
		this.x2 = x2;
		this.y2 = y2;
		
		this.color = color;
		
		this.stroke_width = stroke_width;
		
	}
	
	//Accesseurs
	
	public int getX1(){return this.x1;}
	public int getY1(){return this.y1;}
	public int getX2(){return this.x2;}
	public int getY2(){return this.y2;}
	
	public String getColorLine(){return this.color;}
	public int getStrokeWidth(){return this.stroke_width;}
	
	// Mutateur
	
	public void setX1(int x1){this.x1 = x1;}
	public void setY1(int y1){this.y1 = y1;}
	public void setX2(int x2){this.x2 = x2;}
	public void setY2(int y2){this.y2 = y2;}
	
	public void setColorLine(String color){this.color = color;}
	public void setStrokeWidth(int stroke_width){this.stroke_width = stroke_width;}
	
	
	
	
	/**
	 * Methode toString pour le polyMorphisme
	 */
	 
	 public String toString(){
		return "<line x1 =\"" + this.x1 +"\" y1=\"" + this.y1 + "\" x2=\"" + this.x2 +"\" y2=\""+this.y2 + "\" stroke = \""+ this.color + "\" stroke-width=\""+this.stroke_width + "\"/>";
	 }
}
