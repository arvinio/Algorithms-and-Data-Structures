package linkedList;

public class UsingLinkedList {

	public static void main(String[] args) {
		String key = "HELLO";
		LinkedList<Character> word = new LinkedList<Character>();

		for (int i = 0; i < key.length(); i++) {
			word.append(key.charAt(i));
		}
		//System.out.println("passed");
		System.out.println(word.toString());

	}

}
