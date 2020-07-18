package exceptionHandling;

public class TryCatchBlock {
	public static Functions fun;

	public static void main(String[] args) {

		try {
			// step1: verify about link is present
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("Exception occured :" + e.getMessage());
		}

		try {

			// step 2: verify downloads link is present
			String[] str = new String[2];
			str[2] = "Anand";
			str[2] = "PujaJadhav";
		} catch (Exception e1) {
			System.out.println("Exception occured :" + e1.getMessage());
			System.out.println("Exception occured :" + e1.getLocalizedMessage());
		}
		// step 3: verify project link is present
		fun.fun1();
	}

}
