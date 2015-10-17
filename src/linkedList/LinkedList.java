package linkedList;

public class LinkedList<T extends Comparable<T>> {
	private Node<T> start;
	// TODO keep track of last node

	void append(T head) {
		Node<T> newNode = new Node<T>(head, null);

		if (this.start == null) {
			this.start = newNode;
		} else {

			Node<T> currentNode = this.start;

			while (currentNode.getTail() != null) {
				currentNode = currentNode.getTail();
			}

			currentNode.setTail(newNode);
		}
	}

	public String toString() {
		return toStringHelper(this.start, "");
	}

	private String toStringHelper(Node<T> currentNode, String result) {
		if (currentNode.getHead() == null) {
			return result;
		} else if (currentNode.getTail() != null) {
			String r = currentNode.getHead().toString();
			r = result + r;
			return toStringHelper(currentNode.getTail(), r) + " ";
		}
		return result + currentNode.getHead().toString();
	}

	public void insertAt(int index, Node<T> list, Node<T> newNode) {
		if (index < 0 || index - 1 > getLength()) {
			System.out.println("Index out of bounds.");
			return;
		}
		if (index == 0) {
			Node<T> node0 = this.start;
			Node<T> node1 = node0.getTail();
			Node<T> node2 = node1.getTail();

			this.start = node1;
			node1.setTail(node0);
			node0.setTail(node2);
		}
	}

	public int getLength() {
		return getLengthHelper(this.start);
	}

	private int getLengthHelper(Node<T> node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + getLengthHelper(node.getTail());
		}
	}
}
