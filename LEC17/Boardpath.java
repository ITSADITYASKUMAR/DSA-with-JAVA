package LEC17;

public class Boardpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=sol(0,5,6);
		System.out.println(res);
		}  
	public static int sol(int cp, int des, int dice)
	{
		if (cp == des)
		{
			return 1;
		}
		if (cp > des)
		{
			return 0;
		}
		int cnt =0;
		for(int jump =1; jump <= dice; jump++)
		{
			cnt+= sol (cp +jump, des, dice);
		}
		return cnt;
	}

}
