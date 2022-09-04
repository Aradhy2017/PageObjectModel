package daypratice;
public class inhe
{
    void display()
    {
    System.out.println("bho bho");
    }

}
 class  dog extends inhe
{
	void print()
	{
		System.out.println("booo");
	}
}

 class animal33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d =new dog();
		d.print();
        
	}

}
