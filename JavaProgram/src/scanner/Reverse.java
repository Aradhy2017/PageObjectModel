package scanner;

public class Reverse {

	public static void main(String[] args) {
		int no=1234,reminder,rev=0;
		while(no !=0)
		{
			reminder = no % 10;
			rev =rev*10+reminder;
			no =no /10;
		}
		System.out.println("rev no is"+rev);
		 
		
	    }

	}

		
		
		
		
		
		
		
		
		
		
		
		
		
