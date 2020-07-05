package functions;

public class Function2 {
	static String name = "anand";

	public static void main(String[] args) {

		// i cannot store any value from void function but we can use int in the method
		// to return
		sum(20, 40);
		sum(40, 50);

		sum(60, 50, 3);
		message("puja");
		eligibilty("puja", 25);

		System.out.println(name);

	}

	public static void sum(int a, int b) {

		System.out.println(a + b);

	}

	public static void sum(int a, int b, int c) {
		/*
		 * note whenevrer we have two or more function having same name or different
		 * number of parementers is known as method overloading
		 */
		System.out.println(a + b + c);

	}

	public static void message(String name) {
		System.out.println(name + " ");
	}

	public static void eligibilty(String name, int age) {
		System.out.println("puja eleigible");
	}
}
