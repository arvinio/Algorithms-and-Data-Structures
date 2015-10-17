package linkedList;

public class LinkedList<T extends Comparable<T>> {
	private Node<T> first;
	// TODO keep track of last node

	public static void main(String[] args) {
		LinkedList<Character> word = new LinkedList<Character>();
	}

	public void insertAt(int index, Node<T> list, Node<T> newNode) {
		if (index < 0 || index - 1 > getLength()) {
			System.out.println("Index out of bounds.");
			return;
		}
		if (index == 0) {
			Node<T> node0 = this.first;
			Node<T> node1 = node0.getTail();
			Node<T> node2 = node1.getTail();

			this.first = node1;
			node1.setTail(node0);
			node0.setTail(node2);
		}
	}

	public int getLength() {
		return getLengthHelper(this.first);
	}

	private int getLengthHelper(Node<T> node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + getLengthHelper(node.getTail());
		}
	}
}
