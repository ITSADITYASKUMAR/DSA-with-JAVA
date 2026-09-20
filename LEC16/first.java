package LEC16;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,4,8,9};
		int trgt = 8;
		int res = find(arr, trgt, 0);
		System.out.println(res);
	}
	public static int find (int arr[], int trgt, int idx)
	{
		if (idx == arr.length)
		{
			return -1;
		}
		if (arr[idx] == trgt)
		{
			return idx;
		}
		int res = find(arr, trgt, idx+1);
	return res;			
	}

}
