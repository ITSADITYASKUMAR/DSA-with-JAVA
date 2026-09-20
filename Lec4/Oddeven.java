package Lec4;
import java.util.Scanner;
public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int oddsum=0;
		int evensum=0;
		while (n>0) {
			int temp=n%10;
					if (temp%2==0)
			{
				evensum=evensum+temp;
			}
			else {
				oddsum=oddsum+temp;
			}
					n=n/10;
					
		}
		  System.out.println("Even Sum = " + evensum);
	        System.out.println("Odd Sum = " + oddsum);
	}

}
