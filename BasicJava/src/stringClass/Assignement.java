package stringClass;

public class Assignement {

	public static void main(String[] args) {
		// how many a are present in this string
		String name = "Anand";
		/*
		 * System.out.println(name.indexOf('a')); name="golu";
		 * System.out.println(name.indexOf('a'));
		 */
		String[] arr = name.split("");
		int count = 0;

		/*
		 * for (int i = 0; i < name.length(); i++) { if (name.charAt(i) == 'a' ||
		 * name.charAt(i) == 'A') { count++; } System.out.print(count); }
		 */

		for (String c : arr) {
			if (c.equals("a")) {
				count++;
			}
			System.out.println(count);
		}

	}

}
