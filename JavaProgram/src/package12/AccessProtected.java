package package12;

public class AccessProtected {
	 protected int acc_num =2468;
	 protected void display()
	 {
		 System.out.println("Display acc_num "+acc_num);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessProtected A1 = new AccessProtected ();
		A1.display();
		

	}

}
