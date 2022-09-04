package object;
class Test
{
	void display()
	{
		System.out.println("Here display something ");
	}
}

public class Example3 extends Test {
	 static int last_roll_no=100;
	 int roll_no;
	 Example3()
	 {
		 roll_no=last_roll_no;
		 last_roll_no++;
	 }
	 public int hashcode()
	 {
		 return 505;
	 }
	 public String tostring()
	 {
		 return "BasicCoreJava";
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 e1 =new Example3();
		System.out.println(e1);
		System.out.println(e1.hashCode());
		Test t1 =new Test();
		System.out.println(t1.toString());
		System.out.println(t1.hashCode());

	}

}
