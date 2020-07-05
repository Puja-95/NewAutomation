package ifElseStatements;

public class IfElseNestedIf {

	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		int c = 4;
		if (a > b) {
			if (b > c) {

				System.out.println("a is greater that is- " + a);
			}
		}

		if (b > c) {
			if (c > a) {
				System.out.println("b is greater that is -" + b);
			}
		}

		if (c > b) {
			if (c > a) {
				System.out.println("c is graetre then that is - " + c);
			}

		}
	}

}
