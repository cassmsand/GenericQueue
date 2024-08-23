package genericQueue;

public class LinkQueue<E>{

	private Node<E> head;
	private Node<E> tail;
	
	public LinkQueue() {
		head = null;
		tail = null;
	}
	
	public void enqueue(E elementToAdd) {
		//LinkedList is not empty
		if (head != null) {
			tail.setLink(new Node<E> (elementToAdd, null));
			tail = tail.getLink();
		}
		//LinkedList is empty
		else {
			head = new Node<E> (elementToAdd, null);
			tail = head;
		}
	}
	
	public E dequeue() {
		E temp = head.getData();
		head = head.getLink();
		//if linkedlist is empty
		if (head == null)
			tail = null;
		return temp;
	}
	
	public E peek() {
		return head.getData();
	}
	
	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

}
