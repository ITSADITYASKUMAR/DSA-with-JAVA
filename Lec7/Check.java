package Lec7;
import java.util.Scanner;
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		change (arr);
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static void change (int arr[]) 
	{
		int i = 0;
		int j = arr.length-1;
		while (i<j)
		{
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
}

}
