package LEC16;

public class Alloccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,1,1};
		int trgt = 1;
		int res[] =sol (arr, trgt, 0, 0);
		for (int i =0; i < res.length; i++)
		{
			System.out.print(res[i]+ " ");
		}
	}
	public static int[] sol(int arr[], int trgt, int idx, int cnt)
	{
		if (arr.length == idx)
		{
			int res[] = new int [cnt];
			return res;
		}
		if (arr[idx] == trgt)
		{
			int res[] =sol(arr, trgt, idx+1, cnt+1);
			res[cnt] = idx;
			return res;
		}
		else
		{
			int res[]=sol(arr, trgt, idx+1, cnt);
			return res;
		}
	}

}
