package loops;

public class NestedLoop {

	public static void main(String[] args) {
		for (int rows = 0; rows <= 10; rows++) {
			for (int cols = 0; cols <= 10; cols++) {
				// System.out.println("rows="+rows+ "columns"+cols);
				System.out.print(cols+" ");
			}
			System.out.println();
		}

	}

}
