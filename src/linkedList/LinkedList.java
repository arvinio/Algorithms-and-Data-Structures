package linkedList;

public class LinkedList<T extends Comparable<T>> {
	private Node<T> start;
	public int length = 0;
	// TODO keep track of last node using a length count

	void append(T head) {
		Node<T> newNode = new Node<T>(head, null);

		if (this.start == null) {
			this.start = newNode;
			length++;
		} else {

			Node<T> currentNode = this.start;

			while (currentNode.getTail() != null) {
				currentNode = currentNode.getTail();
			}
			currentNode.setTail(newNode);
			length++;
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

	public void insertAt(int index, LinkedList<T> list, Node<T> newNode) {
		if (index < 0 || index - 1 > getLength()) {
			System.out.println("Index out of bounds.");
			return;
		}
		if (index == 0) {
			Node<T> oldStart = this.start;
			this.start = newNode;
			this.start.setTail(oldStart);
			length++;
			return;
		} else {
			Node<T> currentNode = this.start;
			for (int n = 0; n < index - 1; n++) {
				currentNode = currentNode.getTail();
			}
			Node<T> oldNext = currentNode.getTail();
			currentNode.setTail(newNode);
			newNode.setTail(oldNext);
			length++;
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
