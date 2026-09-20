package Lec7;
import java.util.Scanner;
public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int [n];
		System.out.println("Target value is");
		int target = scn.nextInt();
		for (int i=0 ; i<arr.length ; i++) 
		{
			arr[i]= scn.nextInt();
			
		}
		int res = find (arr, target );
		System.out.println(res);
	}
	public static int find (int[]arr , int target) 
	{
		int idx = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				idx = i;
				break;
			}
		}
		return idx;
	}

}
