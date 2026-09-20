package Lec4;
import java.util.Scanner;
public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean flag=true;
		for (int i = 2; i < n; i++) {
			if (n%i==0) {
				flag=false;
				break ;
			}
//			System.out.println(i);
		}
		if(flag==true)
		{
			System.out.println("Prime h");
		}
		else {
			System.out.println("prime nhi h");
		}
		
	}

}
