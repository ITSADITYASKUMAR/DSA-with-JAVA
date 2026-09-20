package Lec10;

public class Leetcode53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		int max=0;
		int sum=0;
		for (int i = 0; i<arr.length; i++) 
		{
			for (int j = i; j<arr.length; j++)
			{
				for (int k = i; k<=j; k++)
				{
				//	System.out.print(arr[k]+ " ");
					sum+=arr[k];
							
				}
				max= Math.max(sum, max);
				System.out.println();
			}
			
		}
	      System.out.println();
		
	}

}
