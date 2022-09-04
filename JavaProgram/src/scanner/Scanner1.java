package scanner;

import java.util.Scanner;

public class Scanner1 {

	private static Scanner scref;

	public static void main(String[] args) {
		scref = new Scanner(System.in);
     int age;
     double salary;
     String name;
     boolean valid;
     System.out.println("Enter age from Console");
     age=scref.nextInt();
     System.out.println("Enter salary from console");
     salary =scref.nextDouble();
     System.out.println("Enter name from console");
     name = scref.next();
     System.out.println("Enter true false value from console");
     valid = scref.nextBoolean();
     System.out.println("age: " + age);
		System.out.println("salary: " + salary);
		System.out.println("name: " + name);
		System.out.println("valid: " + valid);
     
	}

}
