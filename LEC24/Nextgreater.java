package LEC24;
import java.util.Stack;
public class Nextgreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,9,3,7,2};
		int res[] = sol1(arr);
		for (int i=0; i <arr.length; i++)
		{
			System.out.print(res[i]+" ");
		}
	}
	public static int[] sol1(int arr[])
	{
		int res [] = new int[arr.length];
		Stack<Integer>s=new Stack();
		for (int i =0; i < arr.length; i++)
		{
			while(s.isEmpty() == false && arr[s.peek()] < arr[i])
			{
				res[s.pop()]= arr[i];
			}
			s.push(i);
		}
		while (s.isEmpty() == false)
		{
			res[s.pop()]= -1;
		}
		return res;
	}
	public static int[] sol(int arr[])
	{
		int res[] = new int [arr.length];
		for (int i =0; i< arr.length; i++)
		{
			int j = i+1;
			for (int j =0; j < arr.length; j++)
			{
				if (arr[i] < arr[j])
				{
					res[i] = arr[j];
					break;
				}
			}
			if (j == arr.length)
			{
				res[i] = -1;
			}
		}
		return res;
	}

}
