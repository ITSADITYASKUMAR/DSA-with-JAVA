package Lec19;

public class Head_tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol(2,"",0,0);
	}
	public static void sol(int n, String ans, int T, int H)
	{ if(H+T==n)
	{
		System.out.println(ans);
		return;
	}
	
		sol(n, ans+"H", T, H+1);
		sol(n, ans+"T", T+1,H);
	}
}
