package stringClass;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String1 c1=new String1();
        System.out.println(c1);
        String s1="Mumbai";         // new object will be create in  String constant pool
        String s2="Mumbai";      // no object will be create as its a duplicate object, so 's2' will points to 's1' object
        String s3 ="Banglore";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("s1 Count length :"+s1.length());
        System.out.println("s2 Count length :"+s2.length());
        System.out.println("s2 Count length :"+s3.length());
        
        
        System.out.println("s1 & s2 using equals() " +s1.equals(s2)); //compare s1 and s2 values
        System.out.println("s1 & s2 using === " +(s1==s2));  //compare s1 & s2 based on address
        
        String s4=new String("Mumbai");
        System.out.println(s4);
        System.out.println("s1 & s4 using equals() " +s1.equals(s4));
        System.out.println("s1 & s4 using == " +(s1==s4));
        
        String s5 =new String("Mumbai");
        System.out.println(s5);
        System.out.println("s1 and s5 using equals " +s1.equals(s5));
        System.out.println("s1 and s5 using == "+(s1==s5));
        
        System.out.println("s4 and s5 using equals " +s4.equals(s5));
        System.out.println("s4 and s5 using == "+(s4==s5));
        
        String s6 =new String("Hyderabad");
        System.out.println(s6);
        System.out.println("s1 & s6 using equals " +s1.equals(s6));
        System.out.println("s1 & s6 using == "+(s1==s6));
     
        
        
       
	}

}
