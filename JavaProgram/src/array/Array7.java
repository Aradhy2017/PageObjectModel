package array;

class Example2 {
	int age;
	double salary;

	Example2() {
		System.out.println("Zero-Parm");
	}

	Example2(int a) {
		age = a;
		System.out.println("int-Parm");
	}

	Example2(double a) {
		salary = a;
		System.out.println("double-Parm");
	}

	void calling() {
		System.out.println("calling of Example1 class, age: " + age);
		System.out.println("calling of Example1 class, salary: " + salary);
	}
}

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 e1 = new Example2();
		Example2 e2 = new Example2(45);
		Example2 e3 = new Example2(80.12);

		e1.calling();
		e2.calling();
		e3.calling();

//            int empId1=101,empId2=102,empId3=103;
		int empId[] = new int[3];
		empId[0] = 101;
		empId[1] = 102;
		empId[2] = 103;
		System.out.println("*******************************");

		Example2 e[] = new Example2[3];

		e[0] = new Example2();
		e[1] = new Example2(45);
		e[2] = new Example2(80.12);

		e[0].calling();
		e[1].calling();
		e[2].calling();

	}

}
