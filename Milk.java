public class Milk extends subIngredients {

	
	
	
public Milk(  String name, int calories , int volume) {
super(name, calories);
this.volume = volume;
this.color = new Color();
// white color
color.setRGB(255, 255, 255);
}
public Milk(  String name, int calories ) {
super(name, calories);
this.volume = 5;
this.color = new Color();
// white color
color.setRGB(255, 255, 255);
}





}
