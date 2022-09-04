package practice;
abstract class demo124
{
	int age=67;
	abstract void m1();
	void m2()
	{
		System.out.println("M2 demo124");
	}
	
}
class show extends demo124
{
	void m1()
	{
		System.out.println("M1");
	}
	void m2()
	{
		System.out.println("M2 show");
	}
}
interface i1
{
	double salary=4578.23;
	abstract void animal();
}
interface i2 extends i1
{
	abstract void reptile();
}
public class Practice2 implements i1,i2  {
    public void animal()
	{
		System.out.println("Animal here");
	}
	public void reptile()
	{
		System.out.println("Reptile here");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       show s1=new show();
       s1.m1();
       demo124 d12=new show();
       d12.m2();
       System.out.println(s1.age);
       Practice2 p12 =new Practice2();
       p12.animal();
       p12.reptile();
       i1 i=new Practice2();
       i.animal();
       i2 ii=new Practice2();
        ii.reptile();
      
       
       
	}

}
