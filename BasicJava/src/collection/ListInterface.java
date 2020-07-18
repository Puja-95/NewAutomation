package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
			//generics---we cannot use primitive datatypes like int----we have to use Integer
	list.add("Puja");
	list.add("Akhiles");
	list.add("Nitu");
	
	list.add("Puja");
	for(String s:list)
	{
		System.out.println(s);
	}
	
	}
	

}
	

