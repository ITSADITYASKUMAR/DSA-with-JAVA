package Lec5;

public class Binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10110;
		int multi = 1;
		int ans = 0;
		while (n>0)
		{
			int rem = n%10;
			ans += rem*multi;
			n = n/10;
			multi = multi*2;
			
		}
		System.out.println(ans);
	}

}
