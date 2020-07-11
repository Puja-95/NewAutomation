package functions;

public class TestAccessModPackageLevel {

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.publicFunction();
		obj.defaultfunction();
		
	obj.protectedfunction();

	}
	protected void protectedfunction() {
	}

}
