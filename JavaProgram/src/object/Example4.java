package object;
class Print12
{
	int a=10;
	public int hashCode()
	{
		return 12;
	}
	public String toString()
	{
		return "Basicjava";
	}
	
}
public class Example4 {
	static int last_roll = 100;
	int roll_no;
	Example4()
    {
        roll_no = last_roll;
        last_roll++;
    }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Example4 e2=new Example4();
          System.out.println(e2.toString());
          System.out.println(e2.hashCode());
          Example4 s2 = new Example4();
  		System.out.println("s2: toString of ObjectClass4: "+s2);
  		System.out.println("s2: hashCode of ObjectClass4: "+s2.hashCode()); 
  		System.out.println("s2 anfd e2 compare "+s2.equals(e2));
  		Example4 s3=s2;
  		System.out.println("s3 and s2 compare "+s3.equals(s2));
  		Print12 p1=new Print12();
		System.out.println("toString of Print: "+p1);
		System.out.println("hashCode of Print: "+p1.hashCode());
	}

}
