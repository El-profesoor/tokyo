
public class subIngredients extends Ingredients{
	
	
	public int volume ;
	public Color color ;

	subIngredients(String name, int calories) {
		super(name, calories);
		 this.color=new Color();
		 this.color.setRGB(0, 0, 0);
		 this.volume=5;
	}
	
	subIngredients(String name, int calories , int v) {
		super(name, calories);
		 this.color=new Color();
		 this.color.setRGB(0, 0, 0);
		 this.volume=v;
	}
	
	
	subIngredients(String name, int calories, int r,int g ,int b) {
	   	 super(name, calories);		
	     this.color=new Color(); 
	     this.color.setRGB(r, g, b);
	}


	public int getVolume() {
		return volume;
	}
	
	public Color getColor() {
		return color;
	}

	


	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	// getInfo -----------------------------------------------------------------------------
	@Override
	public String getInfo() {
		 
		return  "\n\nIngredients ***************\nname:"+name +"\ncalories:"+calories+"\ncolor:"+color.getInfo()+"\nvolume:"+volume+"\n\n\n" ; 
	}

}
