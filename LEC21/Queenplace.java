package LEC21;

public class Queenplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] =  new int[1][4];
		sol(arr, 0, 0, arr.length-1, arr[0].length-1, 2, 0, new boolean[1][4], "" );
	}
	public static void sol(int arr[][], int cr, int cc, int er, int ec, int tq, int qpsf, boolean visited[][], String ans)
	{
		if (tq == qpsf)
		{
			System.out.println(ans);
			return ;
		}
		if (cc > ec)
		{
			sol(arr, cr+1, 0, er, ec, tq, qpsf, visited, ans);
			return;
		}
		if (cr > er)
		{
			return;
		}
		visited[cr][cc] = true;
		sol(arr, cr, cc+1, er, ec, tq, qpsf+1, visited, ans + "{" + cr + " " + cc + "}");
		visited[cr][cc] = false;
		sol(arr, cr, cc+1, er, ec, tq, qpsf, visited, ans);
	}

}
