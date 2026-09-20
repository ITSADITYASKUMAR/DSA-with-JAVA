package Lec7;
import java.util.Scanner;
public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[]= new int[n];
		for (int idx=0; idx<arr.length; idx++) {
			arr[idx]=scn.nextInt();
		}
		int res = findMin(arr);
		System.out.println(res);
	}
	public static int findMin(int[]arr) {
		int min =arr[0];
		for (int i=0; i<arr.length;i++) {
			min = Math.min(min,arr[ i]);
		}
		return min;						
	}

}
