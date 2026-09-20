package Lec11;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=  {1,3,4,8,12};
		int trgt = 8;
		int res =find(arr, trgt);
		System.out.println(res);
	}
		public static int find(int arr[],int trgt)
		
		{
			int lo=0;
			int hi=arr.length-1;
			while (lo<=hi)
			{
				int mid = (lo+hi)/2;
				if ( arr[mid]==trgt)
				{
					return mid;
				}else if (arr[mid]>trgt)
				{
					hi=mid-1;
				}else {
					lo =mid+1;
				}
			}
			return -1;
			
		}
	

}
