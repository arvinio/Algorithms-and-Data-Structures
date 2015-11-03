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

	public static String input = "aabcccccaaa";

	public static void main(String[] args) {

		StringCompression sc = new StringCompression();
		char[] indata = input.toCharArray();

		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			count++;
			sc.addToOutput(c, count);
		}

	}

	private void addToOutput(char c, int count) {
		StringBuilder sb = new StringBuilder(input.length());
		sb.append(c);
		sb.append(count);
	}

}
