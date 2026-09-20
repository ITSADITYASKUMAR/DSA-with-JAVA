package Lec10;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,6,0,3,2};
		sort(arr);
	}
	public static void sort(int arr[])
	{
		for (int i = 0; i<arr.length-1; i++)
		{
			int idx=1;
			for (int j = i; j<arr.length; j++)
			{
				if (arr[idx]>arr[j])
				{
					idx = j;
				}
					
			}
			int temp = arr[i];
			arr[i] = arr [idx];
			arr [idx] = temp;
		}
		for (int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
