package functions;

public class Function1 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		System.out.println(a + b);
		
		//call function inside the main function
		sum();
	}

//public			//static					//void										//other than keyword
//protected			//no keyword-(non static)	//any datatype(primitive or non primitive)
//default
//private	
	
//Access modifies // nature of your menthod // return type of menthod // name of menthod  // parameters
	public 			static 					void  						sum					() {
		int a = 40;
		int b = 50;
		System.out.println(a + b);

	}
}
