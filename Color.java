public class Color {
private int r;
private int g;
private int b;

// con. ---------------------------------------
public Color(){
	
	this.r=0; 
	this.g=0; 
	this.b=0; 
}

public Color(int r, int g, int b) {
	

	setR(r);
	setG(g);
	setB(b);
}

// get & set --------------------------------
public int getR() {
return r;
}
public void setR(int r) {
	
	if (r>=0) {
      if (r<=255) this.r = r;
      else if (r>255) this.r = 255; 
	}
	else this.r = 0; 
	
}

public int getG() {
return g;
}

public void setG(int g) {
	if (g>=0) {
	      if (g<=255) this.g = g;
	      else if (g>255) this.g = 255; 
		}
		else this.g = 0; 
}


public int getB() {
return b;
}

public void setB(int b) {
	if (b>=0) {
	     if (b<=255) this.b = b;
	      else if (b>255) this.b = 255; 
		}
		else this.b = 0; 
}

public void setRGB(int i, int j, int k) {
	setR(i);
	setG(j);
	setB(k);
	
}



// to combine two color *********************************

public void mix (Color c) {
	this.r = (this.r+c.r)/2; 
	this.r = (this.g+c.g)/2; 
	this.r = (this.b+c.b)/2; 
	
	
}

// getInfo--------------------------------------------------

public String getInfo() {
	 
	return  "("+r+","+g+","+b+ ")" ; 
}




}