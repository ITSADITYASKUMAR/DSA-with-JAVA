package Lec7;
import java.util.Scanner;
public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[]= new int[n];
		for (int idx=0 ; idx<arr.length ; idx++) {
			arr[idx]=scn.nextInt();
		}
		int res = findMax(arr);
		System.out.println(res);
	}
	public static int findMax(int[] arr){
		int max = arr[0];
		for (int i =0; i <arr.length; i++) {
			max=Math.max(max,arr [i]);
		}
		return max;
		
	}

}
