package functions;

public class NonStaticMethod {
	public String name = "puja";

	public static void main(String[] args) {
		//System.out.println(name);
		NonStaticMethod obj=new NonStaticMethod();
		//obj.name;
		System.out.println(obj.name);
	}

}
