package oops.polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.sum(1, 2);
		obj.sum(1, 2, 3);
		

	}

	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int sum(int a, int b, int c)
	{
		return a+b+c;
	}
	
	
}
