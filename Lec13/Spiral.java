package Lec13;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3,4,17 }, { 5, 6, 7, 8,18 }, { 9, 10, 11, 12 ,19}, { 13, 14, 15, 16 ,20} };

		int cr = 0;
		int cc = 0;
		int er = arr.length - 1;
		int ec = arr[0].length - 1;
		int total = arr.length * arr[0].length;
		int cnt = 0;
		while (cnt < total) {
			for (int col = cc; col <= ec; col++) {
				System.out.print(arr[cr][col] + " ");
				cnt += 1;
			}
			cr++;

			for (int row = cr; row <= er; row++) {
				System.out.print(arr[row][ec] + " ");
				cnt += 1;
			}
			ec--;
			for (int col = ec; col >= cc; col--) {
				System.out.print(arr[er][col] + " ");
				cnt += 1;
			}
			er--;
			for (int row = er; row >= cr; row--) {
				System.out.print(arr[row][cc] + " ");
				cnt += 1;
			}
			cc++;

		}
	}

}
