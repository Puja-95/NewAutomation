package functions;

public class CallVariables {

	public static void main(String[] args) {
		//System.out.println(Variable2.Fruits);
		Variable2 NF=new Variable2();
		//System.out.println(NF.Flowers);
		
		Variable2.Fruits="geeta";
		System.out.println(Variable2.Fruits);//static variable
		
		Variable2 nf=new Variable2();
		
		nf.Flowers="sunflower";
		NF.Flowers="lily";
		System.out.println(NF.Flowers);//non static variable
		System.out.println(nf.Flowers);
		System.out.println(nf.Fruits);
	}

}