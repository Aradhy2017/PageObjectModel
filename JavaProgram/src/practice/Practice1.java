package practice;
class demo{
	static int bb=89;
	int age=45;
    double salary=12345.25;
   static void display()
    {
	    System.out.println("Display here");
    }
   void callme()
   {
	 final int age=12;
	   System.out.println("local age is: "+age);
	   System.out.println("Global age is: "+this.age);
	   System.out.println("Callme");
   }
   void show()
   {
	   this.callme();
	   System.out.println("Show here");
   }
   void print()
   {
	   System.out.println("Print in demo");
   }
	
}
class Bike extends demo
{
	Bike()
	{
		
		System.out.println("Zero-param");
	}
	Bike(float f)
	{
		System.out.println("param");
	}
    void callme(int a,double b)
	{
    	System.out.println("super salary is "+super.salary);
       	System.out.println("int a " +a);
       	System.out.println("double b "+b);
	}
    void callme(int d)
	{
    	super.display();
    	super.callme();
       	System.out.println("int a " +d);
     }
    @Override
    void show()
    {
    	System.out.println("Show in bike");
    }
     void print()
    {
 	   System.out.println("Print in Bike");
    }
	
}
abstract class Shape{
     int d=78;
	 abstract void circle();
	 void rect()
	 {
		 System.out.println("Shape is rectangle");
	 }
}
class Shape2 extends Shape
{
	void circle()
	{
		System.out.println("Circle shape");
	}
	
}

public class Practice1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(demo.bb);
		System.out.print("\n Hello,Welcom to java");
		System.out.println("\tHi");
		int a=90;
		System.out.println("value of a is "+a);
		demo d1=new demo();
		d1.callme();
		System.out.println("age is :" +d1.age);
		System.out.println("Salary is :" +d1.salary);
	     demo.display();
	     Bike b=new Bike();
	    
         b.callme(10,20.12);
         b.callme();
         b.callme(458);
         Bike b1=new Bike(500);
         b1.callme();
         b.show();
         d1.print();
         demo d2=new Bike();
         d2.show();
         d2.print();
         System.out.println("****************Abstract*****************");
         Shape2 s2=new Shape2();
         s2.rect();
         s2.circle();
          System.out.println("abstract class variable d is  "+s2.d);
        	d1.show();	 

	}

}
