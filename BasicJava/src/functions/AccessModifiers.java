package functions;

public class AccessModifiers {

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.defaultfunction();
		obj.protectedfunction();
	}

	public void publicFunction() {
	}

	private void privateFunction() {
	}

	void defaultfunction() {
	}

	protected void protectedfunction() {
	}
}
