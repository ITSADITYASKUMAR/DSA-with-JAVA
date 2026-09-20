package Lec14;

public class leetcode179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,9,34,30};
		String ans =sol(arr);
	System.out.println(ans);
	}
	public static String sol(int arr[])
	{
		for (int i =0; i < arr.length-1; i++)
		{
			for (int j =0; j < arr.length-1-i; j++ )
			{
				String s1 = arr[j] + "" + arr[j+1];
				String s2 = arr[j+1] + "" + arr[j];
				int val1 = Integer.parseInt(s1);
				int val2 = Integer.parseInt(s2);
				if (val2>val1)
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		String ans = "";
		for (int i = 0; i< arr.length; i++)
		{
			ans = ans + arr[i];
		}
		return ans ;
	}

}
