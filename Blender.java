import java.util.ArrayList;

public class Blender {
private ArrayList<Ingredients> ingredients;


private int capacity;
private int volume;
private double calories;
private Color color;
private double  ratioOfCalories;

   Blender(int capacity ){
	   if (capacity<0) this.capacity=50; 
	   else  this.capacity=capacity; 
	   this.volume=0; 
	   this.calories=0; 
	   this.color =new Color();
	   this.color.setRGB(128,128,128);

	
}
   
   Blender( ){
	   this.capacity=100; 
	   this.volume=0; 
	   this.calories=0; 
	   this.color =new Color();
	   this.color.setRGB(128,128,128);
	
}
// to  add Suger to blender ---------------------------------------------------------------
   public void add(Suger s) {
	   this.calories+=   s.getCalories();
	   s.setCalories(0);
	   mix();
	   
   }


// to  add subingredients to blender ---------------------------------------------------------------
public void add(subIngredients ingredient) {
	int freeCapacity= this.capacity-this.volume; 
	 
//          try  {
//        	  if ( freeCapacity< ingredient.getVolume() ) {
//        		  String st="\n\n\n\n\n\n\neroooooooooooorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr\n\n\n\n\n\n\n";
//        		  System.out.print(st);
//        		  throw new Exception();
//        		 
//        		  
//        	  }
//        	  ingredients.add(ingredient);
//        	  this.color.mix(ingredient.getColor());
//        	  this.calories+=ingredient.getCalories();
//        	  this.volume-=ingredient.getVolume(); 
//        	  mix();
//        	  
//            
//              } 
//          catch (Exception e) {
//	           if (freeCapacity>this.volume) {
//	           String st = "\nIt has exceeded the allowed size. You must add a ingredient that is less or equal in size ( " +freeCapacity+")\n" ; 
//	           System.out.print(st);
//	           }
//	 
//	           else {		 
//		       System.out.print("\nyouer Blender full\n ");
//	                }
//           
//	} 
	
  
  	  if ( freeCapacity< ingredient.getVolume() ) {
  		  String st="\nthe volume of ingredient more than free volume of blender \n\n ";
  		  System.out.print(st);
}
  	  else { 
  	 // ingredients.add(ingredient);
  	  this.color.mix(ingredient.getColor());
  	  this.calories+=ingredient.getCalories();
  	  this.volume+=ingredient.getVolume(); 
  	  mix();
  	  
             
}
  	 
}


// getInfo like toString ----------------------------------------------------------------------------
public String getInfo() {
	String st = ""; 
	
	st+="\ncapacity:"+capacity;
	st += "\nthe total amount of calories :" + calories;
	
	st += "\nthe volume is : " + volume+" \n";
	st += "the color of Cocktails is : " + color.getInfo()+" \n";
	
	
	return st ; 
}

// pour Cocktails in the cup if the volume > 0 ---------------------------------------------------------
 public void Pour (Cups c){
	 
	 int freeCupV = c.getCapacity()- c.getVolum();
	 
	 
	try { 
	
	 if (freeCupV==0||this.volume==0 ) throw new Exception();
		 if (freeCupV<=this.volume) {
			 c.setVolum(freeCupV);
			 c.setCalories(freeCupV*ratioOfCalories);
			 this.volume-=freeCupV;
			 this.calories-=freeCupV*ratioOfCalories;
			 mix();
			 
			 
		 }
		 
		 else {
			 c.setVolum(this.volume);
			 c.setCalories(this.volume*ratioOfCalories);
			 this.volume=0;
			 this.calories=0;
			 mix();
		 }
	 }
	catch (Exception e) {

	
			System.out.println("your blender empty or your cup full");
			 
		 
	 }
 
	 
 }







// mix method to cal. the ratioOfCalories --------------------------------------------------------------------
void mix () {
	
	if (volume>0) {
	ratioOfCalories=calories/volume; 
	}
	else ratioOfCalories=0;
	
	
}


}
