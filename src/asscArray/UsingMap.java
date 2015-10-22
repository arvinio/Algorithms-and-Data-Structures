package asscArray;

public class UsingMap {
	public static void main(String[] args) {
		UsingMap query = new UsingMap();
		Map<Integer> map = new Map<>();
		String s1 = "CLINT EASTWOOD";
		String s2 = "OLD WEST ACTION";
		System.out.println(query.isAnagram(s1, s2));
	}

	public boolean isAnagram(String s1, String s2) {
		// remove whitespace
		s1 = filterString(s1);
		s2 = filterString(s2);
		if (s1.length() != s2.length()) {
			return false;
		} else {
			Map<Integer> s1Map = new Map<>();
			Map<Integer> s2Map = new Map<>();

			s1Map.insert(s1);
			s2Map.insert(s2);

			boolean match = true;
			for (int i = 0; i < s1.length(); i++) {
				Character c = s1.charAt(i);
				if (s1Map.getFrequency(c) != s2Map.getFrequency(c)) {
					match = false;
				}
			}
			return match;
		}
	}

	public String filterString(String item) {
		item = item.toLowerCase();
		item = item.replaceAll("\\s+", "");
		return item;
	}
}
