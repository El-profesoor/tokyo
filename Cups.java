public class Cups {

private int capacity ;
private double calories;
private int volum;


// con. ------------------------------------------
public Cups() {
	this.calories=0;
	this.volum=0;
	this.capacity=10; 
	
}
 

public Cups(int capacity) {
	 if (capacity<0)this.capacity=10; 
	  else this.capacity = capacity;
     this.volum=0; 
     this.calories=0; 
}


// get & set ---------------------------------------
public int getCapacity() {
   return capacity;
}


public void setCapacity(int capacity) {
   this.capacity = capacity;
}


public double getCalories() {
   return calories;
}
public void setCalories(double d) {
   this.calories = d;
}


public int getVolum() {
	return volum;
}

public double  addVolum(int volum) {
	
	if ( volum <=0 || this.volum==this.capacity) {
		return volum ;
		
	}
	else  {
		int free = this.capacity-this.volum;
		
		if (free>=volum) {this.volum+=volum;
		
		return 0; 
		}
		else {this.volum=capacity; 
		return volum-free; 
		}
	}

		

}
public void setVolum(int d) {
	   this.volum = d;
	}


public String getInfo() {
	 
	return  "capacity:"+capacity +"\ncalories:"+calories+"\nvolum:"+volum; 
}


}


