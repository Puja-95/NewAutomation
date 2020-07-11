package oops.abstraction;

public abstract class MSword {

	/*
	 * if you have single abstract method in your class then you have to make it
	 * abstract class.
	 */
	/* you cannot create object of abstract class */
	/* an abstract class can have abstract methods and concreate methods */
	//sprint 1
	public abstract void copy();
	public abstract void insert();

	//sprint 2
	public abstract void delete();
	public abstract void save();

	//sprint 2
	public abstract void edit();
	public abstract void layout();
}
