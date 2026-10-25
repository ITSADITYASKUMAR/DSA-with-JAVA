package LEC24;
import java.util.Stack;
public class Stockspan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {100,80,60,70,60,75,87};
		int res[] = sol2(arr);
		for (int i =0; i <arr.length; i++)
		{
			System.out.print(res[i]+" ");
		}

	}
	public static int[] sol2(int arr[])
	{
		int res[] = new int[arr.length];
		Stack<Integer>s = new Stack();
		for (int i = arr.length-1; i>=0; i--)
		{
			while (s.isEmpty()==false && arr[s.peek()] <= arr[i])
			{
				int temp =s.peek();
				int diff = temp-i;
				res[s.pop()] = diff;
			}
		s.push(i);
		}
	while(!s.isEmpty())
	{
		int temp=s.peek();
		res[temp] = s.pop()+1;
	}
	return res;
	}
	public static int[] sol(int arr[])
	{
		int res[] = new int[arr.length];
		for(int i =0; i <arr.length; i++)
		{
			int j = i-1;
			int cnt=1;
			while (j >=0)
			{
				if (arr[i] > arr[j])
				{
					cnt++;
				}else
				{
					break;
				}
				j--;
			}
			res[i] = cnt;
		}
		return res;
	}

}
