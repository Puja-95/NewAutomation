package finalKeyword;

public /*final*/ class Testing {//cannot overide final class
	public /*final*/ int a = 10;

	public void test() {
		a = 20;//whenever we want our variable not change there value.
	}
	public /*final*/ void test2()
	{
		//we cannot overide final method
	}
}//final is usedin selenium-url, screen shot path, driver path
