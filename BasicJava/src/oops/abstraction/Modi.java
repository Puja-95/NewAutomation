package oops.abstraction;

public interface Modi {
// two types of concreate method can be present that is concreate and default
	default void demonetization()
	{
		System.out.println("1000 and 500 currencies are invalid");
	}
}
