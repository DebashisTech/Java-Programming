package array;

public class SecondMaxElementOfAnArray {
	public static void main(String[] args) {
		int a[] = { 2, 5, 8, 4, 3, 7, 6, 5 };

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secondMax = max;
				max = a[i];
			} else if (a[i] > secondMax && a[i] != max) {
				secondMax = a[i];
			}
		}
		if (secondMax ==Integer.MIN_VALUE)
			System.out.println("Second maximum does not exist");
		else
			System.out.println("Second maximum = " + secondMax);
	}

}
