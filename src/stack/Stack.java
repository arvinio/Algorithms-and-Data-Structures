package stack;

import linkedList.Node;

public class Stack {

	Node top;

	/**
	 * @param item: new items pushed to stack point to the previous top.
	 */
	public void push(Object item) {
		Node latest = new Node(item, top);
		this.top = latest;
	}

	public Object pop() {
		if (this.top == null) {
			return null;
		} else {
			Object item = top.getHead();
			this.top = top.getTail();
			return item;
		}
	}

	public Object peek() {
		return this.top.getHead();
	}
}
