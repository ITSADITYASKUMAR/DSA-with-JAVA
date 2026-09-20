package LEC16;

public class Recursionfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,5,1,3,1,1};
		int trgt =1;
		int res=find (arr, trgt, 0,0);
		System.out.println(res);
	}
	public static int find(int arr[], int trgt, int idx, int cnt)
	{
		if (idx == arr.length)return cnt;
		if(arr[idx] == trgt)
		{
			int res=find (arr, trgt, idx+1, cnt+1);
			return res;
			
		}
		else
		{
			int res=find (arr, trgt, idx+1, cnt);
			return res;
		}
	}

}
