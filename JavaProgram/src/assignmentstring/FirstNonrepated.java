package assignmentstring;

public class FirstNonrepated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1 ="teeter";
         
//         
             for(char i : s1.toCharArray() )
             {
        	 if(s1.indexOf(i) ==s1.lastIndexOf(i))
        	 {
        		 System.out.println("First non-repeating Character is "+i);
        	 }
        	
         }
        
	}

}
