package scanner;
class  Training
{
	Training()
	{
		System.out.println("Training Here");
	}
	void manualTesting() {
		System.out.println("I am from manual Testing");
	}
	void automationTesting() {
		System.out.println("I am from Automation Testing");
	}
}

public final class Demo1 {
	static Training t1=new Training();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program start");
		Demo1.t1.automationTesting();
		Demo1.t1.manualTesting();
		Training t2=new Training();
		t2.manualTesting();
		t2.automationTesting();
		System.out.println("Program ends");

	}

}
