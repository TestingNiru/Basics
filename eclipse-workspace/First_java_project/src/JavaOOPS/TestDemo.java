package JavaOOPS;
class supercar extends car {}

class bike{
	
	int model;
	String type;
	double price;
}

class car{
	
	int model;
	String type;
	double price;
	
	/*car (int m, String t, double p){ 
		this.model = m; 
		this.type = t; 
		this.price = p; }*/
		
		void show (int m, String t, double p) {
			model = m; 
			type = t; 
			price = p;
			
		System.out.println("Model No :"+ model );
		System.out.println("Model Type :"+ type);
		System.out.println("Model Price :" + price);
		
		}
	/*public void show(int a, String b, double c) {
	
		System.out.println("Model No : "+ a );
		System.out.println("Model Type :"+ b);
		System.out.println("Model Price :" + c);
		
	} */
		
	
}

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java Demo");
		
		car c1 = new car();
	
		c1.show(1000, "BMW", 24000.00);
		//c1.show();
		
	ClassCar cr = new ClassCar();
	cr.pnt();
 //ClassCar.pnt();
	}

}
