
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Blender b = new Blender(100); 
		System.out.print(b.getInfo());
		
		Fruits f = new Fruits ("me",1);	
		System.out.print(f.getInfo());
		
		Milk m = new Milk ("me",1);	
		System.out.print(m.getInfo());

		
		Ingredients s= new Suger (15);	
		System.out.print(s.getInfo());

		Cups c= new Cups(); 
		System.out.println(c.getInfo());
		
		
		b.add( f);
		System.out.print(b.getInfo());
		b.add(m);
		System.out.print(b.getInfo());
		
	

	}

}


