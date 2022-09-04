package array;

import java.util.Arrays;

public class Copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[] = new int[5];
		num1[0] = 14;
		num1[1] = 20;
		num1[2] = 28;

		System.out.println("length of array is " + num1.length);
		System.out.println(num1[2]);
		System.out.println("**********For each loop**********");
		for (int no : num1) {
			System.out.println(no);
		}
		System.out.println("**********For loop**********");
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}
		System.out.println("**********Copy Array**********");
		int cpno[] = Arrays.copyOf(num1, 3);
		System.out.println("Length of array is " + cpno.length);
		for (int i = 0; i < cpno.length; i++) {
			System.out.println(cpno[i]);
		}
		System.out.println("**********Add Array**********");
		num1[3] = 90;
		num1[4] = 87;
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}
		System.out.println("**********Updated Values**********");
		num1[1] = 45;
		num1[2] = 55;
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}

	}

}
