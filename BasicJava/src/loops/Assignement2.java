package loops;

public class Assignement2 {

	public static void main(String[] args) {
		
		
		for (int i=5; i>=1; --i)//rows- it will decrease on every j value, it will decrease till the i reaches to 1
		{
			//System.out.print(i+" ");
			for (int j=1; j<=i; j++)//for first row this loop will get executed 5 times, till j=5
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
