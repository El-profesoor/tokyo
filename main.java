import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Blender b = new Blender(100); 
		System.out.print("Youer  blender has the following information \n" + b.getInfo());
//		
//		Fruits f = new Fruits ("me",1);	
//		System.out.print(f.getInfo());
//		
//		Milk m = new Milk ("me",1);	
//		System.out.print(m.getInfo());
//
//		
//		Ingredients s= new Suger (15);	
//		System.out.print(s.getInfo());
//
//		Cups c= new Cups(); 
//		System.out.println(c.getInfo());
//		
//		
//		b.add( f);
//		System.out.print(b.getInfo());
//		b.add(m);
//		System.out.print(b.getInfo());
		Scanner input = new Scanner (System.in);
		while (true ) {
			
			System.out.println("\n**********************************************\n"
					+ "Hello you can use one choose in a time: \n"
					           + "1-add Milk \n2-add Fruits \n3-add Suger \n4-exit\n\n"
					           + "************************************************\n ");
			
			int x= input.nextInt();
			switch (x) {
			case 1 : {
				System.out.println("Enter the  numer of cups  of milk you want \n note:volume of cup 50 ml \n number of caloris in milk to volume is (46) ");
				int amount = input.nextInt();
				Milk m = new Milk ("Milk",amount*50); 
				b.add(m);
				System.out.print("Youer  blender has the following information \n" + b.getInfo());
				continue ;
				
			}
			case 2 : {
				System.out.println("you have the following Fruits : "
						+ "\n    name        \t\t\t\tcaloris\t\t\t\tvolume\t\t\t\t         color"
						+ "\n 1- Strawberry   \t\t\t\t  33  \t\t\t\t  7   \t\t\t\t  (255, 0, 0)"
						+ "\n 2- Banana        \t\t\t\t  89  \t\t\t\t  25  \t\t\t\t  (255, 255, 0)"
						+ "\n 3- Watermelon    \t\t\t\t  30  \t\t\t\t  25  \t\t\t\t  (255, 0, 0) "
						+ "\n 4- Apple         \t\t\t\t  52  \t\t\t\t  30  \t\t\t\t  (141, 182, 0) "
						+ "\n 5- Orange        \t\t\t\t  47  \t\t\t\t  38  \t\t\t\t  (255, 127, 0)");
				
				int f = input.nextInt();
				
				Fruits fruits = null ; 
				
				switch(f) {
				
				case 1 :  fruits = new Fruits ("Strawberry",33);	
				case 2 :  fruits = new Fruits ("Banana",89,25,255,255,0);	
				case 3 :  fruits = new Fruits ("Watermelon",30,25,255,0,0);	
				case 4 :  fruits = new Fruits ("Apple",52,30,141,182,0);	
				case 5 :  fruits = new Fruits ("Orange",47,38,255,127,0);	
				
				
				
				
				}
				
				
				
				b.add(fruits);
				System.out.print("Youer  blender has the following information \n" + b.getInfo());
				continue ;
				
			}
			
			
			
			case 3 : {
				System.out.println("you have the following Fruits : "
						+ "\n   ");
				
				Suger s= new Suger (15);	 
				b.add(s);
				System.out.print("Youer  blender has the following information \n" + b.getInfo());
				continue ;
				
			}
			
			case 4 : {
			System.exit(0);
			
				
			  }
			
			}
		}
    }

}


