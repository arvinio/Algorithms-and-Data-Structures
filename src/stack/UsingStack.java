package stack;

public class UsingStack {
	public static void main(String[] args) {
		Stack stack = new Stack();
		char[] name = { 'a', 'r', 'v', 'i', 'n' };
		for (Character c : name) {
			stack.push(c);
		}

		Object top = stack.peek();
		System.out.println(top);
	}
}
