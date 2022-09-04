package package1;

import package12.AccessProtected;

public class Defaultmember11 extends AccessProtected  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Defaultmember11 D1 =new Defaultmember11();
		D1.display();
		System.out.println("Account no  "+D1.acc_num);

	
	}
	class B extends Defaultmember11
	{
		B b=new B();
		b.display();
	}

}
