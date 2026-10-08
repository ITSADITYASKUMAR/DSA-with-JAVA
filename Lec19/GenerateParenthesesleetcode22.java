package Lec19;

public class GenerateParenthesesleetcode22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol(4,"",0,0);
	}
	public static void sol(int n, String ans, int cb, int ob)
	{ if (ob>n/2 || ob<cb)
		return;
	if(ob + cb == n)
	{
		System.out.println(ans);
		return;
	}
	
		sol(n, ans+"(", cb, ob+1);
		sol(n, ans+")", cb+1,ob);
	}
}

