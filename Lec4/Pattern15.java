package Lec4;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		n = n * 2 - 1;
		int nst = 5;
		int nsp = 0;
		int row = 0;
		while (row < n) {
			for (int space = 0; space < nsp; space++) {
				System.out.print("  ");
			}
			for (int star = 0; star < nst; star++) {
				System.out.print("* ");
			}
			if (row < n / 2) {
				nsp += 2;
				nst--;
			} else {
				nsp -= 2;
				nst++;
			}

			row++;
			System.out.println();

		}

	}

}