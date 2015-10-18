package linkedList;

public class UsingLinkedList {

	public static void main(String[] args) {
		String key = "ARVINBEHSHAD";
		LinkedList<Character> word = new LinkedList<Character>();

		for (int i = 0; i < key.length(); i++) {
			word.append(key.charAt(i));
		}
		// word.insertAt(0, word, new Node<Character>('_', null));
		// word.insertAt(1, word, new Node<Character>('_', null));
		// word.insertAt(10, word, new Node<Character>('X', null));
		word.reverseList();
		System.out.println(word.toString());
		System.out.println("Length = " + word.length);

	}

}
