package Lec13;

public class Diagonal_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};	
		
		int nod = arr.length + arr[0].length-1;
		int row=0;
		int col=0;
		int cnt = 0;
		while (cnt<nod)
		{
			int r= row;
			int c= col;
			while (r<arr.length && c>=0)
			{
				System.out.print(arr[r][c]+" ");
				r++;
				c--;
			}
			if (col+1 == arr[0].length)
			{
				row++;
			}
			else 
			{
				col++;
			}
			cnt++;
		}
		
		
		
		
		
	}

}
