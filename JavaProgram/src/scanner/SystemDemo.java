package scanner;

public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("System user Dir: "+System.getProperty("user.home"));
       System.out.println("Current working Dir "+System.getProperty("user.Dir"));
       System.clearProperty("user.home");
       System.out.println("updated System User Dir: "+System.getProperty("user.home"));
       System.setProperty("user.country", "IND");
       System.out.println(System.getProperty("user.country"));
       System.out.println("other than system property: "+System.getProperty("user.password", "none of your business"));

		System.out.println("difference between the current time and midnight, January 1, 1970 UTC is: "
				+ System.currentTimeMillis());
		System.out.println("current time in " + "nano sec: " + System.nanoTime());
	}

}
