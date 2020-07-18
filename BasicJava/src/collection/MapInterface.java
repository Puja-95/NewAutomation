package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("name", "PujaJadhav");
		map.put("email", "pujapowar30@gmail.com");
		map.put(null, "pujapowar");
		System.out.println(map.get("name"));
		System.out.println(map.get("email"));
		System.out.println(map.get(null));

		/*
		 * Map<String, String> map1=new Hashtable<>(); map1.put("name", "PujaJadhav");
		 * map1.put("email", "pujapowar30@gmail.com"); map1.put(null, "pujapowar");
		 * System.out.println(map1.get("name")); System.out.println(map1.get("email"));
		 */

		/*
		 * Hashtable: Its a legacy class(start of java) it doenit allow null key it is
		 * sychnoised/ threadsafe(multiple in parallel mode)
		 * 
		 * Hashmap 1. its a new class added in java. 2. it allows you strore one null key its
		 * not synchronized
		 */

	}

}
