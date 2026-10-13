package LEC21;

public class Nqueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
		int n = 4;
		sol(arr, 0 ,0, n-1, n-1, 4, 0, new boolean[1][4], "")
	}
	public static void sol(int arr[][], int cr, int cc, int er, int ec, int tq, int qpsf, boolean visited[][], String ans)
	{
		if (tq == qpsf)
		{
			System.out.println(ans);
			return;
		}
		if(tq-qpsf > arr.length-cr)
		{
			return;
		}
		if (cc > ec)
		{
			sol(arr, cr+1, 0, er, ec, tq, qpsf, visited, ans );
			return;
		}
		if(isItPossible(cr, cc, visited) == true);
		visited[cr][cc] = true;
		sol(arr, cr, cc+1, er, ec, tq, qpsf+1, visited, ans+"{" +  cr+ "}" + cc);
		visited[cr][cc] = false;
	}
	sol(arr, cr, cc+1, er, ec, tq, qpsf, visited, ans);

}
public static boolean isItPosiible(int cr ,int cc, boolean visited[][])
{
	for (int row=0; row >= 0; row++)
	{
		if(visited[row][cc]== true)return false;
	}
	int row = cr;
	int col = cc;
	while (row>= 0 && col>=0) {
		if (visited[row][col] == true)return false;
		row--;
		col--;
	}
	row = cr;
	col = cc;
	while(row >=0 && col < visited.length)
	{
		
	}
}




