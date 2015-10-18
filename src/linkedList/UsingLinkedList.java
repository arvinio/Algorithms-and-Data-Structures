package linkedList;

public class UsingLinkedList {

	public static void main(String[] args) {
		String key = "ARVINBEHSHAD";
		LinkedList<Character> word = new LinkedList<Character>();

		for (int i = 0; i < key.length(); i++) {
			word.append(key.charAt(i));
		}

		word.reverseList();
		System.out.println("Reverse: " + word.toString());

		word.reverseList();
		System.out.println("Reverse back: " + word.toString());

		word.append('_');
		System.out.println("Append: " + word.toString());

		word.insertAt(5, word, new Node<Character>(' ', null));
		System.out.println("Insert space: " + word.toString());

		word.replaceValue('T', 2);
		System.out.println("Replace 'V': " + word.toString());

		System.out.println("Length: " + word.length);
	}

}
