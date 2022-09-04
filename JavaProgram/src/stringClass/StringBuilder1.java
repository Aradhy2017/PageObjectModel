package stringClass;

public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Java");
		System.out.println(sb);
		sb.append("Hello");
		System.out.println("After Append: " +sb);
		sb.reverse();
		System.out.println("Reverse of sb is:" +sb);
		StringBuilder sb1=new StringBuilder("Hello Java");
		System.out.println(sb1);
		StringBuilder sb2=new StringBuilder("Hello Java");
		System.out.println(sb2);
		System.out.println(sb1.equals(sb2));//address basis comparison
		System.out.println(sb1==sb2);
		System.out.println(sb1.toString().equals(sb2.toString()));
	}

}
