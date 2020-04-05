public class Ingredients {

public String name;
public int calories;




Ingredients(String name, int calories) {
	 this.name = name;
	 this.calories = calories;
	
	 }

 
 
// get & set funs-----------------------------------------------------------------------

public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getCalories() {
return calories;
}
public void setCalories(int calories) {
this.calories = calories;
}

// getInfo -----------------------------------------------------------------------------
public String getInfo() {
	 
	return  "\n\nIngredients--------------------\nname:"+name +"\ncalories:"+calories+"\n\n" ; 
}





}