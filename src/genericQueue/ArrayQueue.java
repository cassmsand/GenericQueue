package genericQueue;

public class ArrayQueue<E> {
	
	private Object[] data;
	private int head;
	private int manyItems;
	
	public ArrayQueue(int numSlots){
		data = new Object[numSlots];
		head = 0;
	}
	
	public void enqueue(E elementToAdd) {
		//Check to see if manyItems is NOT equal to the length of the array, room to add
		if (manyItems != data.length) {
			data[(head + manyItems) % data.length] = elementToAdd;
			manyItems++;
		}
	}
	
	public E dequeue() {
		//Check to see if there's data to dequeue
		if (manyItems != 0) {
			E temp = (E) data[head];
			head = (head + 1) % data.length;
			manyItems--;
			return temp;
		}
		//No data to dequeue, empty queue
		else
			return null;
	}
	
	public E peek() {
		if (manyItems != 0)
			return (E) data[head];
		else
			return null;
	}
	
	public boolean isEmpty() {
		if (manyItems == 0)
			return true;
		else
			return false;
		
	}
	
	
}
