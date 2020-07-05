package oops.inheritance;

public class Smartphone extends Mobile {

	public void VideoCallin()
	{
		System.out.println("calling from smartphone");
	}

}
//we cannot achieve multiple inheritance in one class- ambiquity, as the class contain two duplicate menthods in telephone and mobile
// but we can achieve multilevel inheritance- in this case smart phine can extends Telephone and mobile class