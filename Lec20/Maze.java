package Lec20;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol(0,0,3,3);
	}
	public static int sol(int cr, int cc, int ec, int er)
	{
		if (cr<0)
		{
			return 0;
		}
		int up = sol(cr-1, cc, er, ec);
		int down = sol(cr+1, cc, er, ec);
		int left =sol(cr, cc-1, er, ec);
		int right= sol(cr, cc+1, er, ec);
		return 0;
		
	}

}
