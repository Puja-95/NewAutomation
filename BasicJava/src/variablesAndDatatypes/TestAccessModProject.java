package variablesAndDatatypes;

import functions.AccessModifiers;
import functions.TestAccessModPackageLevel;

public class TestAccessModProject extends AccessModifiers {

	public static void main(String[] args) {
		AccessModifiers obj= new AccessModifiers();
		obj.publicFunction();
		
		//obj.protectedfunction();-> you can access at project level by using child class object
		
		
	
	}

}
