package exceptionHandling;

public class TryCatchBlock2 {
	public static Functions fun;

	public static void main(String[] args) {

		try {
			// step1: verify about link is present
			int a = 10;
			int b = 2;
			System.out.println(a / b);

			// step 2: verify downloads link is present
			String[] str = new String[2];
			str[1] = "Anand";
			str[2] = "PujaJadhav";

			// step 3: verify project link is present
			fun.fun1();

		} catch (ArithmeticException e1) {
			System.out.println("Exception occured :" + e1.getMessage());

		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Exception occured :" + e1.getMessage());

		} catch (NullPointerException e1) {
			System.out.println("Exception occured :" + e1.getMessage());

		} catch (Exception e1) {
			System.out.println("Exception occured :" + e1.getMessage());

		}
	}

}
