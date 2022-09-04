package daypratice;

class One {
	float x = 4.5f;
	double y = 234.90;
	static int A = 10;

	One() {
		System.out.println("One Constructor with default");
	}

	One(float j) {
		this(4.5, 85);
		System.out.println("One Constructor with float");
	}

	One(int z) {
		System.out.println("One is Parameterized Cons...");
		x = z;
	}

	One(Double a, int b) {
		this(4);
		y = a + b;
		System.out.println("One cons of double and int");
	}

	static void display() {
		double y = 7845.23;
		System.out.println("Local value of y is " + y);

		System.out.println("Hi,Aradhy");
	}

	int sum(int a, int b) {
		double y = 45789.5;
		System.out.println("local value of y is " + y);
		System.out.println("Global value of y is " + this.y);
		System.out.println(a + b);
		return (a + b);
	}

	static void display(double salary) {
		System.out.println("Salary is " + salary);
	}

	void show() {
		System.out.println("Grandfather");
	}

}

class Two extends One {
	public void company() {
		System.out.println("I'm maruti");
	}

	public void animal() {
		super.display();
		System.out.println("bho bhooo");
	}

	static void m1() {
		System.out.println("From Two Class m1 method");
	}

	void m2() {
		super.show();
		System.out.println("From Two class m2 method");
	}

	void show() {
		super.display(1245.2);
		System.out.println("Parent");
	}

}

class Three extends Two {
	void employee() {
		super.sum(100, 100);
		System.out.println("I am employee of ABC");
	}

	static void m1() {

		System.out.println("From class three m1 static method");
	}

	void m2() {
		super.animal();
		System.out.println("From class three m2 method");
	}

	void show() {
		System.out.println("Child");
	}
}

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	protected void draw() {
		System.out.println("Draw Rectangle");
	}

}

class Circle extends Rectangle {
	public void draw() {
		System.out.println("Draw Circle");
	}
}

interface Drawable {
	int salary = 25000;

	void draw();

}

class Rectangle12 implements Drawable {
	public void draw() {
		System.out.println("Interface Rectangle");
	}
}

class Circle12 extends Rectangle12 implements Drawable {
//	public void draw()
//	{
//		System.out.println("Interface Circle12");
//	}
}

class encap {
	private int ssn;
	private int empsalary;

	public int getssn() {
		return ssn;
	}

	public void setssn(int ssn) {
		this.ssn = ssn;
	}

	public int getempsalary() {
		return empsalary;

	}

	public void setempsalary(int empsalary) {
		this.empsalary = empsalary;

	}
}

public class Pratice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 12;
		System.out.print("Hello,\t Java");
		System.out.println("Bye");
		System.out.println("\n Akash");
		System.out.println("*********static************");
		System.out.println(" Static global value of A is :" + One.A);
		System.out.println(" local value of s is :" + s);
		One.display();
		System.out.println("**********Non-static************");
		One o1 = new One();
		System.out.println("Global non static variable x is " + o1.x);
		System.out.println("Global non static variable y is " + o1.y);
		o1.sum(0, 0);
		o1.sum(-1, -1);
		System.out.println("The sum is " + o1.sum(-3, -2));
		One.display(1245.365);
		System.out.println("**********Constructor************");
		One o2 = new One(5);
		System.out.println("The value of parameterized cons...." + o2.x);
		One o3 = new One(7.5, 9);
		System.out.println("The value of double and int parameterized cons...." + o3.y);
		System.out.println("**********Inheritance************");
		Two t1 = new Two();
		t1.company();
		System.out.println("Class 2 inherit the clas A sum method " + t1.sum(15, 20));
		System.out.println("********** Three Inheritance************");
		Three t3 = new Three();
		t3.company();
		t3.animal();
		t3.employee();
		System.out.println("**********Homogenous Overriding************");
		Three t4 = new Three();
		t4.m2();
		System.out.println("**********Heterogenous Overriding************");
		Two r1 = new Three();
		r1.m2();
		t3.m2();
		One o5 = new Three();
		o5.show();
		One o6 = new Two();
		o6.show();
		System.out.println("**********super Overriding************");
		t1.m2();
		t3.m2();
		t1.show();
		System.out.println("**********Abstact************");
		Shape s6 = new Rectangle();
		s6.draw();
		System.out.println("**********Abstact************");
		Shape s7 = new Circle();
		s7.draw();
		Rectangle s8 = new Circle();
		s8.draw();
		System.out.println("**********Interface************");
		System.out.println("Salary in interface " + Drawable.salary);
		Circle12 c1 = new Circle12();
		c1.draw();
		Drawable d11 = new Circle12();
		d11.draw();
		Rectangle12 r13 = new Circle12();
		r13.draw();
		encap obj = new encap();

		System.out.println("Employee SSN: " + obj.getssn());
		System.out.println("Employee Age: " + obj.getempsalary());

	}

}
