

public class Circle_SVG extends Formes{
	
	//coordonnées du centre du cercle
	private int cX;
	private int cY;
	
	// rayon du cercle
	private int rayon;
	
	private String color;
	
	public Circle_SVG(int cX, int cY, int rayon, String color){
		this.cX= cX;
		this.cY = cY;
		this.rayon = rayon;
		this.color = color;
	}
	
	//Accesseur
	
	public int getCx(){ return this.cX;}
	public int getCy(){return this.cY;}
	public int getRayon(){return this.rayon;}
	public String getCircleColor(){ return this.color;};
	
	
	//Mutateur
	
	public void setCx(int cX){ this.cX = cX;}
	public void setCy(int cY){this.cY = cY;}
	public void setRayon(int rayon){this.rayon = rayon;}
	public void setCircleColor(String color){this.color = color;}
	
	
	public String toString(){
	return "<circle cx= \""+ this.cX +"\" cy=\"" + this.cY + "\"r=\""+ this.rayon + "\" fill =\"" +this.color +"\"/>";
	}

	

}
