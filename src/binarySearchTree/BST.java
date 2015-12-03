package binarySearchTree;

public class BST {
	private Node root;

	public void insert(int key, String value){
		root = insert(root, key, value)
	}

	public Node insert(Node current, int key, String value) {
		if (current == null) {
			return new Node(key, value);
		}
		if (key > current.getKey()) {
			current = current.right();
		} else if (key < current.getKey()) {
			current = current.left();
		} else {
			current.setValue(value);
		}
		return current;
	}
}
