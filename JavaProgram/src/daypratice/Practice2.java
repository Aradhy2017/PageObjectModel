package daypratice;

import java.util.Scanner;

class Animal
{
	static float salary=500f;
	int y =66;
	
	Animal()
	{
		
		this(150,50);
		
		System.out.println("default constructor");
	}
	Animal(double t)
	{
	
		
		System.out.println("Double value of t is: "+t);
	}
	Animal(int j,double k)
	{
		this(145.23);
		double sum=j + k;
		System.out.println("sum is :"+sum);
		System.out.println("Parameterized constructor");
	}
	
	public void squar()
	{
		
		int y=1000;
		System.out.println("Local value is ;"+y);
		System.out.println("Global non static value :"+this.y);
		System.out.println("Overloading ");
	}
	public void squar(int p,int q)
	{
		
		int no=p*q;
		System.out.println("multiplication is :"+no);
		System.out.println("Overloading between square second");
	}
	
}
class Fruit
{
	int fruitage =45;
	void taste()
	{
		System.out.println("Fruits are sweet");
	}
	int trangle()
	{
		return fruitage;
		
	}
	
}
class Orange extends Fruit
{
	int orangefruit=46;
	void taste()
	{
		
		int fruitage =15;
		System.out.println("local value is :"+fruitage );
		System.out.println("Global non-static value is:"+super.fruitage);
		System.out.println("Tart in taste");
	}
}
abstract class shape
{
	double height=56587;
	public abstract void round();
}
class Triangle extends shape
{
	public void round()
	{
		System.out.println("Mango is round ");
	}
}
interface Size
{
	 public static final int salary =5000;
	 public abstract void rectangle();
}
class Xsize implements Size
{
	public void rectangle()
	{
		System.out.println("Rectangle shape");
	}
	
}
interface S1
{
	public void ss();
	
}
class Lsize implements Size,S1
{
	public void Msize()
	{
		System.out.println("Medium size");
	}

	@Override
	public void rectangle() {
		// TODO Auto-generated method stub
		System.out.println("Rect in Lsize");
	}

	@Override
	public void ss() {
		// TODO Auto-generated method stub
		System.out.println("ssssssssssss");
		
	}
}
class Honda
{
	int speedlimit=200;
	void run()
	{
		System.out.println("Honda Running");
	}
}
class Bike extends Honda
{
	int speedlimit=500;
	void run()
	{
		System.out.println("Bike running");
		System.out.println("local speedlimit is:"+speedlimit);
		System.out.println("Global speedlimit is:"+super.speedlimit);
	}
}
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double z= 75846;
		System.out.println("local value is "+z);
		System.out.println("Static Global value is :"+Animal.salary);
		Animal a= new Animal();
		System.out.println("Non-static variable : "+a.y);
		a.squar();
		a.squar(15, 10);
		Animal a2 = new Animal(25);
		Animal a1= new Animal(40,50);
		Orange o1 =new Orange();
		o1.taste();
		System.out.println("OrangeFruitage is: "+o1.orangefruit);
		System.out.println("FruitAge is :"+o1.fruitage);
		Triangle t1= new Triangle();
		System.out.println("Height is :"+t1.height);
		t1.round();
		Xsize x1= new Xsize();
		x1.rectangle();
		System.out.println("Interface salary is:"+x1.salary);
		Lsize l1=new Lsize();
		System.out.println(l1);
		System.out.println("The object of toString is :"+l1.toString());
		System.out.println("hashcode"+l1.hashCode());
		Lsize l2 =new Lsize();
		System.out.println(l2);
		System.out.println("hashcode is "+l2.hashCode());
		System.out.println("l1 and l2 equal or not :"+l1.equals(l2));
		Lsize l3=l2;
		System.out.println("l3 and l2 equal or not :"+l3.equals(l2));
		l1.rectangle();
		System.out.println("Interface salary is:"+l1.salary);
		l1.ss();
		Honda h1=new Bike();
		h1.run();
		System.out.println("Speed of vehical is :"+h1.speedlimit);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter num1");
//		int num1 =sc.nextInt();
//		System.out.println("Enter num2");
//		int num2=sc.nextInt();

//		System.out.println("the sum is :"+sum);
		String s1=new String();
		System.out.println(s1);
		String s2="Mumbai";
		String s3 ="Mumbai";
		String s4="Banglore";
		String s5= "Ban";
		System.out.println("s2 and s3 is :"+s2.equals(s3));
		System.out.println("s2 and s3 is :"+s2==s3);
		System.out.println("The length of s1:"+s2.length());
		System.out.println("The length of s4:"+s4.length());
		System.out.println("concate is: "+s2.concat(s4));
		System.out.println("The charAt Position :"+s2.charAt(3));
		System.out.println(s2.contains(s3));
		System.out.println(s4.contains(s5));
		System.out.println(s2.isEmpty());
		System.out.println(s2.replace("Mumbai", "mum"));
		System.out.println(s2);
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
	
 
	}

}
