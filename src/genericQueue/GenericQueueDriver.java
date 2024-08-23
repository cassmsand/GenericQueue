package genericQueue;

public class GenericQueueDriver {

	public static void main(String[] args) {
		
		LinkQueue<String> linkQueue = new LinkQueue<String>();
		
		System.out.println("***Linked List Queue example:***");
		linkQueue.enqueue("first in - Blue");
		linkQueue.enqueue("Red");
		linkQueue.enqueue("Green");
		linkQueue.enqueue("Yellow");
		linkQueue.enqueue("Purple");
		
		linkQueue.dequeue();
		linkQueue.enqueue("last in - Pink");
	
		System.out.print("\nAfter adding 6 elements to the queue and removing 1, is the queue empty: ");
		System.out.print(linkQueue.isEmpty() + "\n");
		
		System.out.println("\nList of all items in queue: ");
		// While the queue is not empty, dequeue
		while (!linkQueue.isEmpty()) {
			System.out.println(linkQueue.dequeue());
		}
		
		System.out.print("\nAfter dequeuing all elements from the queue, is the queue empty: ");
		System.out.print(linkQueue.isEmpty());
		
		System.out.println(); //space
		
		ArrayQueue<String> arrayQueue = new ArrayQueue<String>(10);
		
		System.out.println("\n***Array Queue example:***");
		arrayQueue.enqueue("first in - Bear");
		arrayQueue.enqueue("Frog");
		arrayQueue.enqueue("Pig");
		arrayQueue.enqueue("Tiger");
		arrayQueue.enqueue("Whale");
		arrayQueue.dequeue();
		arrayQueue.enqueue("last in - Shark");
	
		System.out.print("\nAfter adding 6 elements to the queue and removing 1, is the queue empty: ");
		System.out.println(arrayQueue.isEmpty());
		
		System.out.println("\nList of all items in queue: ");
		while (arrayQueue.isEmpty() != true) {
			System.out.println(arrayQueue.dequeue());
		}
		
		System.out.print("\nAfter dequeuing all elements from the queue, is the queue empty: ");
		System.out.println(arrayQueue.isEmpty());

	}

}
