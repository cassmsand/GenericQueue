package genericQueue;

public class Node<E> {
	
	private E data;
	private Node<E> link;
	
	public Node (E elementToAdd, Node<E> elementBehind) {
		data = elementToAdd;
		link = elementBehind;
	}

	//Getters and setters
	public E getData() {
		return data;
	}

	public Node<E> getLink() {
		return link;
	}

	public void setData(E data) {
		this.data = data;
	}

	public void setLink(Node<E> link) {
		this.link = link;
	}

}
