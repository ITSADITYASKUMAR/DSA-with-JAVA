package LEC22;

public class Generate_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,15,25};
		int b[] = {1,5,20,30};
		sol(a, b, true, 0,0,0, "");
	}
	public static void sol(int a[], int b[], boolean flag,int idxa, int idxb, int prev, String ans)
	{ 
//		base case
		if (flag == true && ans.length()!=0)
		{
			System.out.println(ans);
		}
		if (flag == true)
//			agar true hai toh A se uthana hai 
		{ 
			for (int i =idxa; i < a.length; i++)
			{
				if(a[i] > prev)
				{
					sol (a, b, false,i+1, idxb, a[i], ans+a[i]+ " ");
				}
			}
		}
		else
//			agar false hai toh B se uthana hai
		{
			for(int i =idxb; i < b.length; i++)
			{
				if (b[i] > prev)
				{
					sol (a, b, true,idxa, i+1, b[i], ans+b[i]+" ");
				}
			}
		}
	}

}
