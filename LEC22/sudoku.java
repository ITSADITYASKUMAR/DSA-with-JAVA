package LEC22;

public class sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[][] = new char[9][9];	
		arr[0][0]='5';
		sol(arr, 0, 0, 8, 8);
	}
	public static boolean sol(char arr[][], int cr, int cc, int er, int ec) {
		if(cr==er&&cc==ec+1)
		{
			display(arr);
		return true;
		}
		if(cc>ec)
		{
	return  sol(arr,cr+1,0,er,ec);
	
		}
		if (arr[cr][cc] == '.') {
			for (int i = 1; i <= 9; i++) {
				if (isItPossible(arr, cr, cc, i) == true) {
					arr[cr][cc] = (char) ('0' + i);
					boolean res=sol(arr, cr, cc + 1, er, ec);
				if(res==true)return true;
                	arr[cr][cc] = '.';
				
                }
			}
		} else {
			return sol(arr, cr, cc + 1, er, ec);
		}
        return false;
	}
	public static boolean isItPossible(char arr[][],int cr,int cc,int temp)
	{
        char val=(char)(temp+'0');
		for(int col=0;col<9;col++)
		{
			if(arr[cr][col]==val)return false;
		}
		for(int row=0;row<9;row++)
		{
			if(arr[row][cc]==val)return false;
		}
		int sr=cr-cr%3;
		int sc=cc-cc%3;
		for(int i=sr;i<sr+3;i++)
		{
			for(int j=sc;j<sc+3;j++)
			{
				if(arr[i][j]==val)return false;
			}
		}
		return true;
	}
    public static void display(char arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
