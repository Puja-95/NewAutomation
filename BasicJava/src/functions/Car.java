package functions;

public class Car {

	String colour;
	int capacity;

	public void features() {
		System.out.println("car faetures are colour= " + colour + ", and capacity=" + capacity);
		// constructor is used to intialise the object

	}

	public Car(String colour, int capacity) {
		this.colour=colour;
		this.capacity=capacity;
	}

	public Car()
	{
		
	}
}
