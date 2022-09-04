package scanner;

public class NegativeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int no=-60;
       for(int i=no;i<=Math.abs(no);i++)
       {
    	   if(i==0)
    	   {
    		   continue;
    	   }
    	   else
    	   {
    		   if(no %i==0)
    		   {
    			   System.out.println(i);
    		   }
    	   }
       }
	}

}
