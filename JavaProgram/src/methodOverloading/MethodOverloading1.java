package methodOverloading;
class DisplayOverloading {
	public void disp(char c) {
		System.out.println(c);
	}
	public void disp(char c, int num) {
		System.out.println(c + " " + num);
	}
}
public class MethodOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayOverloading obj = new DisplayOverloading();
		obj.disp('a');
		obj.disp('a', 10);
		MethodOverloading1 m2=new MethodOverloading1();
		m2.call(63.5);
		m2.call(123);
	}
	public void call(double d) {
		System.out.println("Calling.....");
	}
	public void call(int num) {
		System.out.println("Calling....."+num);
	}
	}


