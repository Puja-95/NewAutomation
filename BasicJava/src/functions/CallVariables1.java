package functions;

public class CallVariables1 {

	public static void main(String[] args) {
		System.out.println(Variables1.name);
		Variables1 ref=new Variables1();
		//System.out.println(ref.name2);
	
		Variables1 ref2=new Variables1();
		
		ref.name="Puname";//global define variables
		ref2.name="Kiya";
		
		
		System.out.println(ref.name);
		System.out.println(ref.name);
		System.out.println(ref2.name2);
		System.out.println(ref2.name);
		
	}

}
