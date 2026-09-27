package Lec18;

public class Leetcode55jumpgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,1,1,4};
		boolean res =sol(0, arr);
		System.out.println(res);
	}
	public static boolean sol (int idx, int arr[])
	{
		if (idx == arr.length-1)
		{
			return true;
		}
		if (idx >= arr.length) return false;
		for (int jump = 1; jump<= arr[idx] ; jump++)
		{
			boolean res =sol (idx + jump, arr);
			if (res == true);
			return true;
		}
		return false;
	}

}
