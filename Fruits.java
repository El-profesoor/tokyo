public class Fruits extends subIngredients {

	Fruits(String name, int calories) {
		super(name, calories);
		this.color= new Color();
		// black color
		color.setRGB(0, 0, 0);
		this.volume=5; 
	}


public Fruits(  String name, int calories, int volume, int r, int g , int b) {
                 super(name, calories);
                 this.color= new Color();
                 color.setRGB(r, g, b);
                 this.volume=volume; 

}



}