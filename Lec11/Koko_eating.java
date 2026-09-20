package Lec11;

public class Koko_eating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 6, 7, 11};
		int hr = 5;
		System.out.println(sol(arr, hr));
	}
	public static int sol(int arr[], int hr)
	{
		int lo =1;
		int hi = 0;
		int ans=0;
		for (int i =0; i<arr.length; i++)
		{
			hi+= arr[i];
		}
		while (lo<=hi)
		{
			int mid = (lo+hi)/2;
			if (isItPossible(arr,mid,hr) == true)
			{
				ans =mid;
				hi= mid-1;
			}
			else
			{
				lo = mid+1;
			}
		}
		return ans;
	}


public static boolean isItPossible(int arr[], int mid, int hr)
{
	int time =0;
	for (int i =0; i<arr.length;i++)
	{
		if (arr[i]<=mid )
		{
			time +=1;
		}
		else
		{
			if (arr[i]% mid == 0 )
			{
				time += arr[i]/mid;
			}else
			{
				time += arr[i]/mid+1;
			}
		}
		if (time>hr)
			return false;
	}
	return true;
}
}