package LEC17;

public class Cutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[] = {4,5,2,3,1};
		int res =sol (5 , 0 , price);
		System.out.println(res);
	}
	public static int sol(int n, int profit, int price[])
	{
		if (n == 0)return profit;
		int ans = Integer.MIN_VALUE;
		for(int cut =1; cut <= n; cut++)
		{
			int res =sol(n-cut , profit+price[cut-1], price);
			ans = Math.max(res, ans);
		}
		return ans ;
	}

}
