package object;

public class Test78   
{  
    Test78(int a, int b)  
    {  
        System.out.println("a = "+a+" b = "+b);  
    }  
    Test78(int a, float b)  
    {  
        System.out.println("a = "+a+" b = "+b);  
    }  
    public static void main (String args[])  
    {  
        byte a = 10;   
        byte b = 15;  
        Test78 test = new Test78(a,b);  
    }  
}
