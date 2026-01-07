package array;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 6, 7, 8, -1 };
		a[a.length - 1] = 3;
		int key = a[a.length - 1];
		int j = a.length - 2;
		while (j >= 0 && a[j] > key) {
			a[j + 1] = a[j];
			j--;
		}
		a[j + 1] = key;
		System.out.println(Arrays.toString(a));
	}

}
