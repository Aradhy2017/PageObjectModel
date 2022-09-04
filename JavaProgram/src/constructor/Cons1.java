package constructor;

public class Cons1 {
	int roll;
	double salary;
	Cons1(int r,double s){
		roll=r;
		salary=s;
	}
	void display() {
		System.out.println(roll + " " + salary);
	}
	public static void main(String args[]) {
		Cons1 c1 = new Cons1(101,250045.45);
		c1.display();
		Cons1 c2 = new Cons1(201,550045.45);		
		c2.display();
	}
}
/**
parameterized constructor: is used to initialize different values non-static variable at the time of object creation

*/