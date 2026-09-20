package Lec7;

public class Arrayintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[5];
				System.out.println(arr.length);
		for (int idx=0;idx<arr.length;idx++)
		{
			arr[idx]=idx+1;
		}
		System.out.println(arr);
		for (int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
