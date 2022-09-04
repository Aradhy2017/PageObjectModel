package package12;

public class DefaultPackage {
	int accNum=12345;
	void displayAccNum() 
	{
		System.out.println("Account Number: "+accNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultPackage p1=new DefaultPackage();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessDefaultMembers {

	public static void main(String[] args) {
		
		DefaultPackage p1=new DefaultPackage();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
/**
default members are accessible with in package 
*/