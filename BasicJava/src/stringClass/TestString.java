package stringClass;

public class TestString {

	public static void main(String[] args) {

		String str = "Selenium";
		//1st function length 
		System.out.println(str.length());
		
		//2nd function char
		System.out.println(str.charAt(3));
		
		//3rd function upper case
		System.out.println(str.toUpperCase());
		
		//4th function lower case
		System.out.println(str.toLowerCase());
		
		//5 th function is replace
		System.out.println(str.replace("len", "123"));
		
		//6th function SuSstring
		System.out.println(str.substring(4));

	//7 function substring in between
		System.out.println(str.substring(2, 5));
		
		//8th function split string
		String[] arr=str.split("len");
		System.out.println(arr.length);
		System.out.println(arr[0]);
		
		String str2="selenium";
		System.out.println(str.equals(str2));//gives output in true or false
		System.out.println(str.equalsIgnoreCase(str2));
	}

}
