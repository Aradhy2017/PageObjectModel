package assignmentstring;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="India is my country";
		str =str.replaceAll("\\s+", "");
        System.out.println("Remove white space "+str);
	}
}
