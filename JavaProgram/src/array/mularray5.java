package array;

public class mularray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][] = new int[3][3];
		System.out.println("Array size is " + num.length);

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
			}
		}
		System.out.println("*****************************");
		num[0][0] = 10;
		num[0][1] = 14;
		num[0][2] = 17;
		num[1][0] = 45;
		num[1][1] = 75;
		num[1][2] = 40;
		num[2][0] = 35;
		num[2][1] = 45;
		num[2][2] = 50;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
			}
		}

	}

}
