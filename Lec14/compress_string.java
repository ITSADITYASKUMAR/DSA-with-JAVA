package Lec14;

public class compress_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbcccdeeefggh";
		 String res= compress(str);
		 System.out.println(res);
	}
	public static String compress(String str)
	{
		String ans = " ";
		int i =0;
		while (i < str.length())
		{
			int cnt = 1;
			int j = i+1;
			while (j<str.length() && str.charAt(i) == str.charAt(j))
			{
			cnt++;
			j++;
			}
		
		if (cnt == 1)  ans = ans + str.charAt(i);
		ans = ans + str.charAt(i) + cnt;
		i = j;
		
		
	}
	return ans;
	}
}
