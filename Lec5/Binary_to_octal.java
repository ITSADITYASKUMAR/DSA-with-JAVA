package Lec5;

public class Binary_to_octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1010;
		int multi = 1;
		int ans = 0;
		while (n>0)
		{
			int rem = n%8;
			ans += rem*multi;
			n = n/8;
			multi = multi*2;
			
		}
		System.out.println(ans);
	}

}
