package array;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age[] = { 12, 34, 56, 98, 10, 5 };
		System.out.println("Accessing Element ");
		System.out.println("First Element " + age[0]);
		System.out.println("second Element " + age[1]);
		System.out.println("three Element " + age[2]);
		System.out.println("Four Element " + age[3]);
		System.out.println("three Element " + age[4]);
		System.out.println("Four Element " + age[5]);
		System.out.println("************For-each*******");
		for (int num : age) {
			System.out.println(num);
		}
		System.out.println("************Using For Loop*******");
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
			if (age[i] == 12) {
				System.out.println(age[i]);
				break;
			} else {
//    		   System.out.println("age is not 56");    	   
			}
		}
		System.out.println("************Using For-each Loop*******");
		for (int num1 : age) {
			System.out.println(num1);
			if (num1 == 98) {
				System.out.println(num1);
				break;
			} else {
//    		   System.out.println("age is not 98");
			}
		}
	}

}
