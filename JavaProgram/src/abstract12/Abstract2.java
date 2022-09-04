package abstract12;
abstract class Bike
{
	abstract void run();
	static void speed(int spd)
	{
		System.out.println("Bike Speed "+spd);
	}
	static void color() {
		System.out.println("Bike color is blue");
	}
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("running safely");
	}
	static void speed(int spd)
	{
		System.out.println("Honda speed is "+spd );
//		super.speed(100);
	}
	static  void color() {
		System.out.println("Honda1 color is blue");
	}
}
public class Abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Honda h1=new Honda();
         h1.run();
         h1.speed(120);
         Bike b1=new Honda();
         b1.run();
         b1.speed(150);
         b1.color();
	}

}
