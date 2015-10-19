package stack;

import linkedList.Node;

public class Stack<T> {

	Node top;

	/**
	 * @param item: new items pushed to stack point to the previous top value
	 */
	public void push(Object item) {
		Node latest = new Node(item, top);
		this.top = latest;
	}

}
