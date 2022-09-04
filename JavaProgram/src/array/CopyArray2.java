package array;

import java.util.Arrays;

public class CopyArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char copyfrom[] = { 's', 'f', 'g', 't', 'k' };
		char copyto[] = Arrays.copyOf(copyfrom, copyfrom.length);
		for (int i = 0; i < copyto.length; i++) {
			System.out.println(copyto[i]);
		}

		System.out.println("************Copy using range****************");
		char copyrange[] = Arrays.copyOfRange(copyfrom, 2, copyto.length);
		for (int i = 0; i < copyrange.length; i++) {
			System.out.println(copyrange[i]);
		}

	}
}
