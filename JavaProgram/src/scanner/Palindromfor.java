package scanner;

public class Palindromfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int no=1215,rem,rev=0,temp;
       temp=no;
       for(;no>0;no=no/10)
       {
          rem=no %10;
          rev=(rev*10)+rem;
       }
       if(temp==rev)
       {
    	   System.out.println("no is Palindrom");
       }
       else
       {
    	   System.out.println("not Palindrom");
       }
	}

}
