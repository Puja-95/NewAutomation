package ifElseStatements;

public class IfelseClass3NestedIfStatements {
	// pratice nested condition-complete the below code
	// learn questions based on Git
	public static void main(String[] args) {
		int a = 10;
		int b =30;
		int c = 20;

		if (a > b) {
			if (b > c) {
				System.out.println("This will check whether A is Graeter or not");
			}
		}

		if (b > a) {
			if (c > b) {
				System.out.println("this will check b is graeter or not");
			}
		}

		if (c > a) {
			if (b > a) {
				System.out.println("this will check c s greather then or not");
			}
		}
		// And operator
		int age = 10;

		boolean voterid = true;

		if (age > 18 && voterid) {
			System.out.println("elegible");
		} else {
			System.out.println("not elegible");
		}

		// or operator
		boolean panCard = true;
		boolean adharCard = true;

		if (panCard || adharCard) {
			System.out.println("eligible");
		} else {
			System.out.println("not elegible");
		}
	}
}