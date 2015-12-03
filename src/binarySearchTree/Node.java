package binarySearchTree;

public class Node {
	private int key;
	private String value;
	private Node left, right;

	public Node(int Key, String value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return this.key;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Node left() {
		return this.left;
	}

	public Node right() {
		return this.right;
	}

}