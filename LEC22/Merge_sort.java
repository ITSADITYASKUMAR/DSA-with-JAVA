package LEC22;

public class Merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,8,-1,2,1,9};
		int res[]=sort(arr, 0, arr.length-1);
		for (int i =0; i < res.length; i++)
		{
			System.out.print(res[i]+ " ");
		}
	}
	public static int[] sort(int arr[], int lo, int hi)
	{
		if(lo==hi)
		{
			int res[]=new int[1];
			res[0]=arr[lo];
			return res;
		}
		int mid=(lo+hi)/2;
		int left[]=sort(arr,lo,mid);
		int right[]=sort(arr,mid+1,hi);
		int ans[]=merge(left,right);
	return ans;
	}
	public static int[] merge(int left[],int right[])
	{
		int i=0;
		int j=0;
		int k=0;
		int res[]=new int[left.length+right.length];
		while(i<left.length&&j<right.length)
		{
			if(left[i]<right[j])
			{
				res[k]=left[i];
				i++;
				k++;
			}
			else {
				res[k]=right[j];
				j++;
				k++;
			}
		}
		while(j<right.length)
		{
			res[k]=right[j];
			j++;
			k++;
		}
		while(i<left.length)
		{
			res[k]=left[i];
			i++;
			k++;
		}
	return res;
	}

}
