package array;

// A clockwise spiral matrix is a matrix in which elements are filled or visited in a clockwise spiral order starting from the top-left corner.

/*
1   2   3   4   5
16  17  18  19  6
15  24  25  20  7
14  23  22  21  8
13  12  11  10  9 
*/

public class SpiralMatrix {
	public static void main(String[] args) {

		int n = 5;
		int a[][] = new int[n][n];

		int val = 1;
		char dir = 'r';
		int row = 0, col = 0;

		// boundaries
		int top = 0, bottom = n - 1;
		int left = 0, right = n - 1;

		while (val <= n * n) {

			a[row][col] = val++;

			switch (dir) {

			case 'r':
				if (col == right) {
					dir = 'd';
					top++;
					row++;
				} else {
					col++;
				}
				break;

			case 'd':
				if (row == bottom) {
					dir = 'l';
					right--;
					col--;
				} else {
					row++;
				}
				break;

			case 'l':
				if (col == left) {
					dir = 'u';
					bottom--;
					row--;
				} else {
					col--;
				}
				break;

			case 'u':
				if (row == top) {
					dir = 'r';
					left++;
					col++;
				} else {
					row--;
				}
				break;
			}
		}

		// print matrix
		for (int[] x : a) {
			for (int y : x) {
				System.out.print(y + "\t");
			}
			System.out.println();
		}
	}
}