package linkedList;

/**
 * a-b-c-d-corrupt
 * @author arvin
 *
 */
public class CorruptList {

	public static void main(String[] args) {

		String key = "QWERTY";
		LinkedList<Character> word = new LinkedList<>();

		for (int i = 0; i < 3; i++) {
			word.append(key.charAt(i));
		}

		System.out.println(word.toString());

		// Setting up the conditions
		Node<Character> temp = new Node<Character>(null, null);
		Node<Character> a = new Node<Character>('Q', temp);

		Node<Character> corruptNode = new Node<Character>('R', null);
		Node<Character> d = new Node<Character>('E', corruptNode);
		Node<Character> c = new Node<Character>('W', d);
		Node<Character> b = new Node<Character>('R', c);

		a.setTail(b);

	}

}
