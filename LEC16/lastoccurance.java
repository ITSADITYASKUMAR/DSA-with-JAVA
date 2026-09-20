package LEC16;

public class lastoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,2,1,3,1};
		int tre=find (arr, 1 ,0);
		System.out.println(tre);
		
	}
	public static int find(int arr[], int trgt, int idx)
	{
		if (arr.length == idx) return -1;
		if (arr[idx] == trgt)
		{
			int res=find(arr, trgt, idx+1);
			if (res == -1)
			{
				res = idx;
			}
			return res;
		}
		else
		{
			int xcv=find (arr, trgt, idx+1);
			return xcv;
		}
	}

}
