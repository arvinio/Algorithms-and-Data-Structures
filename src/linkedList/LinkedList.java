package linkedList;

public class LinkedList<T extends Comparable<T>> {
	private Node<T> start;
	private Node<T> last;
	public static int length = 0;

	void append(T value) {
		Node<T> newNode = new Node<T>(value, null);

		if (this.start == null) {
			this.start = newNode;
			length++;
			last = newNode;
		} else {
			last.setTail(newNode);

			length++;
			last = newNode;
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
		if (!indexCheck(index))
			return;
		if (index == 0) {
			Node<T> oldStart = this.start;
			this.start = newNode;
			this.start.setTail(oldStart);
			length++;
			last = newNode;
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
			last = newNode;
		}
	}

	public void reverseList() {
		// check if first three nodes exist before while-loop
		if (this.start == null || this.start.getTail() == null || this.start.getTail().getTail() == null) {
			return;
		}
		// separate case for start node
		Node<T> secondNode = this.start.getTail();
		Node<T> thirdNode = secondNode.getTail();
		secondNode.setTail(this.start);
		this.start.setTail(null);

		// set final definitions
		Node<T> currentNode = thirdNode;
		Node<T> previousNode = secondNode;

		while (currentNode.getTail() != null) {
			Node<T> nextNode = currentNode.getTail();
			currentNode.setTail(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		// since loop stops before last node
		currentNode.setTail(previousNode);
		this.start = currentNode;
	}

	public void replaceValue(T newValue, int index) {
		if (!indexCheck(index))
			return;
		Node<T> currentNode = this.start;

		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getTail();
		}
		currentNode.setHead(newValue);
	}

	public boolean indexCheck(int index) {
		if (index < 0 || index - 1 > this.length) {
			System.out.println("Index out of bounds.");
			return false;
		} else
			return true;
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
