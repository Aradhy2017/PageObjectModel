package package12;

public class PrivateMemeber {
	private int acc_no=12345;
	private void displayacc()
	{
		
		System.out.println("Account Number: "+acc_no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateMemeber p1=new PrivateMemeber();
		p1.displayacc();
		System.out.println("Account no is "+p1.acc_no);
	}

}
class AccessPrivateMembers2 {

	public static void main(String[] args) {
		
		PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
/**
 * private member are accessible with in class only
 */