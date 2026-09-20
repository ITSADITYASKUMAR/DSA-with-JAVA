package Lec3;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int nsp = n-2;
		for (int row = 0; row<n; row++) {
			if (row==0 || row==n-1) {
				for (int cst=0; cst<n; cst++) {
					System.out.print("* ");
				}
			}
				else {
					System.out.print("* ");
					for (int csp=0; csp<nsp; csp++) {
						System.out.print("  ");
					}
					System.out.print("* ");
				}
				System.out.println();			}
		}
	}


