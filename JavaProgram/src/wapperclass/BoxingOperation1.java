package wapperclass;

public class BoxingOperation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1= 'A';
		Character cobj =new Character(c1);
		System.out.println(c1);
		System.out.println(c1==cobj);
        Character charObj2=new Character('Z');//
		
		Character charObj3='H';//
		
		System.out.println("c1: "+c1);//
		System.out.println("charObj1: "+cobj);
		System.out.println("charObj2: "+charObj2);
		System.out.println("charObj3: "+charObj3);
		
		boolean b=true;
		Boolean bobj =new Boolean(b);
		System.out.println(bobj == b);
		

	}

}
