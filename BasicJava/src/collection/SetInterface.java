package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {

		/*
		 * Set<String> set = new HashSet<>();
		 * 
		 * set.add("Puja"); set.add("Akhiles"); set.add("Nitu"); set.add("Puja"); for
		 * (String s1 : set) { System.out.println(s1); }
		 */

		/*
		 * Set<String> set1 = new TreeSet<>();
		 * 
		 * set1.add("Puja"); set1.add("Akhiles"); set1.add("Nitu"); set1.add("Puja");
		 * for (String s1 : set1) { System.out.println(s1);
		 * 
		 * }
		 */

		/*
		 * Set<String> set1 = new LinkedHashSet<>();
		 * 
		 * set1.add("Puja"); set1.add("Akhiles"); set1.add("Nitu"); set1.add("Puja");
		 * 
		 * for (String s1 : set1) { System.out.println(s1); }
		 */

		Set<String> set1 = new LinkedHashSet<>();
		set1.add("Puja");
		set1.add("Akhiles");
		set1.add("Nitu");
		set1.add("Puja");
		Iterator<String> it = set1.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
