package graphs;

public class Node<Key, Value> {
	private Node left, right;
	private Key key;
	private Value value;

	public Node(Key Key, Value value) {
		this.key = key;
		this.value = value;
	}

	public Key getKey() {
		return this.key;
	}

	public Value getValue() {
		return this.value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public void setKey(Key key) {
		this.value = value;
	}

	public Node left() {
		return this.left;
	}

	public Node right() {
		return this.right;
	}

}