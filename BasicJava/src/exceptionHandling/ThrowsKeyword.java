package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

	public static void main(String[] args) throws Exception {
		try {
			test();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test2();

		test5(6);
	}

	// why we use throws keyword-to declare the checked exception and to pass the
	// exception

	/*
	 * if your function is used by small team- handle the exception by try and catch
	 * if your function is used big team- then use throws declare
	 */

	public static void test() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("");
	}

	public static void test2() {
		try {
			FileInputStream file = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// throws will not work with uncheckexception-no benefit if used-
	// throws will only with checked exception
	public static void test3() throws ArithmeticException {

	}

	public static void test5(int age) throws Exception {

		if (age >= 18) {
			System.out.println("you are elegible");
		} else {
			throw new Exception("you are not eleiglibe");
		}
	}
}
