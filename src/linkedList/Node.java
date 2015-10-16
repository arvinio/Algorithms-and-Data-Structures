package linkedList;

/**
 * @author Arvin
 *
 * @param <T> Generic type
 * 
 */
public class Node<T> {

	private T head;
	private Node<T> tail;

	/**
	 * @param head contains the data
	 * @param rest pointer to next node
	 */
	public Node(T head, Node<T> tail) {
		this.head = head;
		this.tail = tail;
	}

	public T getHead() {
		return this.head;
	}

	public Node<T> getTail() {
		return this.tail;
	}

	public void setTail(Node<T> newTail) {
		this.tail = newTail;
	}

}
