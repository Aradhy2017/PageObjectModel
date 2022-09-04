package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q1 =new PriorityQueue();
		System.out.println("Size: " + q1.size());
		System.out.println("Eleements of Queue: " + q1);
		 //element() returns top most element of the queue, if the queue if empty dn it
		 //will throw an exception by name 'NoSuchElementException'
		System.out.println("head element of the queue using element():" + q1.element());
		// peek() returns top most element of the queue, if the queue if empty dn it
		// will return 'null' instead of throwing exception
		System.out.println("head element of the queue using peek():" + q1.peek());
	

	}

}
