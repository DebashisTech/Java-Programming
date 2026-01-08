package array;

import java.util.HashMap;

public class FrequencyOfElementOfAnArray {
	public static void main(String[] args) {
		int a[] = { 4, 2, 6, 1, 9, 2, 6, 4, 8 };
		frequency(a);
	}

	static void frequency(int a[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.get(a[i]) == null) {
				map.put(a[i], 1);
			} else {
				int c = map.get(a[i]);
				c++;
				map.put(a[i], c);
			}
			
		}
		System.out.println(map);
	}
}
