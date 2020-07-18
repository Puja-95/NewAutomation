package exceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {
		try {
			System.out.println("open to connections");
			System.out.println(10 / 0);
			System.out.println("Puja");
			System.out.println(10 / 0);
			//System.out.println("connect to data base");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {// it is used to close the costly resource
			System.out.println("connect to data base");
		}
	}

}
