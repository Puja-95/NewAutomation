package array;

public class Array1 {

	public static void main(String[] args) {
		/*
		 * String name="sneha"; String name1="sneha"; String name2="sneha";
		 */

		String[] std = new String[7];

		std[0] = "puja";
		std[1] = "sneha";
		std[2] = "pratik";
		std[3] = "anand";
		std[4] = "sneha1";
		std[5] = "sneha2";
		std[6] = "sneha3";

		/*
		 * System.out.println(std[0]); System.out.println(std[2]);
		 * System.out.println(std[3]);
		 */

		for (int i = 0; i<std.length; i++) {
			System.out.println(std[i]);
		}

	}

}
