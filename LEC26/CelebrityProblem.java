package LEC26;
import java.util.Stack;
public class CelebrityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1, 1, 0},
	            {0, 1, 0},
	            {0, 1, 1}};
		System.out.println(sol(arr));
	}	
	public static int sol(int arr[][])
	{
		Stack<Integer>s = new Stack<>();
		for (int i =0; i<arr.length; i++)
		{
			s.push(i);
		}
		while (s.size()>1)
		{
			int c1= s.pop();
			int c2= s.pop();
			if (arr[c1][c2] ==0 && arr[c2][c1] == 0)
			{
				continue;
			}
			if (arr[c1][c2] ==1 && arr[c2][c1] == 1)
			{
				continue;
			}
			if (arr[c2][c1] ==0 && arr[c1][c2] == 1)
			{
				s.push(c2);
			}
			if (arr[c2][c1] ==1 && arr[c1][c2] == 0)
			{
				s.push(c1);
			}
		}
		if (s.size() ==0)
			return -1;
		int val = s.pop();
		for (int i = 0; i < arr.length; i++)
		{
			if (val == i)
				continue;
			if(arr[val][i] == 1)
				return-1;
		}
		for (int i=0; i < arr.length; i++)
		{
			if(arr[i][val]!=1)
				return -1;
		}
		return val;
	}

}
