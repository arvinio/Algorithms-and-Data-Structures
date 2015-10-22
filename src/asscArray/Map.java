package asscArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Builds associative array mapping inserted words to calculate char frequency.
 * Is case-INsensitive.
 * @author arvin
 *
 * @param <T>
 */
public class Map<T> {

	private List<Integer> map = new ArrayList<Integer>();

	// initialize map with zeros
	public Map() {
		for (int i = 0; i < 127; i++) {
			map.add(0);
		}
	}

	public void insert(String item) {
		// make case-insensitive
		item = item.toLowerCase();
		Integer count = 0;
		for (int i = 0; i < item.length(); i++) {
			Character c = item.charAt(i);

			// get ASCII value for current char
			int charIndex = (int) c;

			count = map.get(charIndex);
			count = count + 1;

			map.set(charIndex, count);
		}
	}

	public int getFrequency(Character value) {
		Character c = value.toLowerCase(value);
		int charIndex = (int) c;
		return map.get(charIndex);
	}
}
