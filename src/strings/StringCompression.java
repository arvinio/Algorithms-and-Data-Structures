package strings;

/**
 * 
 * @author arvin
 * Problem: Create a basic string compression alg using counts of the
 * repeated chars. If the compressed string wouldn't be shorter, return the
 * original string.
 * 
 * Sample input: aabcccccaaa
 * Sample output: a2b1c5a3
 * 
 * Steps:
 * -convert to char[]
 * -traverse array
 * --get char
 * --while same char
 * ---count char freq
 * --if diff char
 * ---save count, then reset
 * 
 * 
 */

public class StringCompression {

	public static void main(String[] args) {
		String input = "aabcccccaaa";
		StringCompression sc = new StringCompression();
		sc.count(input);

	}

	private void count(String input) {
		char prev = 0;
		char current = '0';
		int count = 1;
		for (int i = 0; i < input.length(); i++) {
			current = input.charAt(i);
			if (i != 0) {
				prev = input.charAt(i - 1);
				if (current == prev) {
					count++;
				}
			}
			if ((i >= input.length() - 1) || (current != input.charAt(i + 1))) {
				addToOutput(input, i, count);
				count = 1;
			}
		}
	}

	private void addToOutput(String input, int i, int count) {
		StringBuilder sb = new StringBuilder(input.length());
		sb.append(input.charAt(i));
		sb.append(count);
		System.out.println(sb);
	}

}
