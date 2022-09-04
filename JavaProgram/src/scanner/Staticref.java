package scanner;
class Demo
{
	void display()
	{
	  System.out.println("Display here ");	
	}
	void callme()
	{
		System.out.println("Callme");
	}
}
public class Staticref {
	static Demo d12 =new Demo();
	void test()
	{
		System.out.println("Test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticref.d12.display();
		Staticref.d12.callme();
		Demo d1 =new Demo();
		d1.callme();
		d1.display();
		Staticref s=new Staticref();
		s.test();
		

	}

}
