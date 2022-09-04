package stringClass;

public class SingleClassObject  {
	/**
	 * 1. constructor should be private
	 * 2. create static ref variable of the class
	 * 3. create static method which return current class object
	 */
	//1. constructor should be private
	private SingleClassObject()
	{
		System.out.println("Sampleton class cons");
	}
	//2. create static ref variable of the class
	public static SingleClassObject singleObj =new SingleClassObject();
	
	//3. create static method which return current class object
		public static SingleClassObject getSampletonObject() {
			return singleObj;
		}
		public void display() {
			System.out.println("I am display()");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleClassObject  s1 = SingleClassObject .getSampletonObject();
		s1.display();

	}

}
