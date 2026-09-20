package Lec6;
import java.util.Scanner;
public class Isarmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean res=isArmStrong(n);
		System.out.println(res);
		
	}
	public static boolean isArmStrong(int n) {
		int temp=n;
		int cnt=0;
		while(n>0)
		{
		 cnt++;
		 n = n/10;
		}
		n = temp;	
		int sum=0;
		while(n>0)
		{
				int rem=n%10;
				sum=sum+(int)Math.pow(rem, cnt);
				n = n/10;
				
		}
		if (sum==temp) {	
			return true;
		}
		else {
			return false;
		}
//		System.out.println();
//		System.out.println(n);
//		
	}
}
