package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.Smartphone;
import oops.inheritance.Telephone;

public class DynamicPolymorhism {

	public static void main(String[] args) {
		/*
		 * Smartphone objname=new Smartphone(); Mobile objname2=new Smartphone();
		 */
		Telephone objname3 = new Smartphone();
		// you can use your parent class reference to child class
		// but you cannot reference to your child class to parent class---> example
		// below
		// REFRENCE CLASS // PARENT CLASS
		// Smartphone objname4=new Mobile();

		//objname3.calling();
		/*
		 * if your are using ref of your parent class to the object of child class then
		 * you can only call those functions of which are there in parent class
		 */

		/*
		 * Telephone obj1; obj1 = new Telephone(); obj1.calling();
		 * 
		 * obj1 = new Mobile(); obj1.calling();
		 * 
		 * obj1 = new Smartphone(); obj1.calling();
		 */

		/*
		 * if we have oriden class in our child class then we can call that functions
		 * from child class
		 */

		Telephone obj2 = null;
		String browsername = "chrome";
		if (browsername.equals("chrome")) {
			obj2 = new Mobile();
			// obj2.calling();
		} else if (browsername.equals("firefox")) {
			obj2 = new Smartphone();

		}
		obj2.calling();
	}

}
