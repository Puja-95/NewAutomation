package functions;

public class ReturnType {

	public static void main(String[] args) {
		sum(20, 40);
		boolean c = eligiblity(18);

		
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static boolean eligiblity(int age) {
		if (age >= 18) {
			System.out.println("I am eligible");
			return true;

		} else {
			System.out.println("I am not eligible");
			return false;
		}
	}
}
