package LEC24;

public class Stockspan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {100,80,60,70,60,75,87};
		int res[] = sol(arr);
		for (int i =0; i <arr.length; i++)
		{
			System.out.print(res[i]+" ");
		}

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
