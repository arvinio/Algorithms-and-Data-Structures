package graphs;

public class BST<Key extends Comparable<Key>, Value> {
	private Node root;

	public void insert(Key key, Value value) {
		root = insert(root, key, value);
	}

	public Node insert(Node current, Key key, Value value) {
		if (current == null) {
			return new Node(key, value);
		}
		int cmp = key.compareTo((Key) current.getKey());

		if (cmp > 0) {
			current = current.right();
		} else if (cmp < 0) {
			current = current.left();
		} else {
			current.setValue(value);
		}
		return current;
	}

	public Value get(Key key) {
		Node current = root;
		int cmp = key.compareTo((Key) root);
		while (current != null) {
			if (cmp > 0) {
				current = root.right();
			} else if (cmp < 0) {
				current = root.left();
			} else {
				return (Value) current.getValue();
			}
		}
		return null;
	}
}
