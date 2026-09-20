package Lec4;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7;
int nst=n/2;
int nsp=1;
int row=0;
while(row<n)
{
	if(row==0||row==n-1)
	{
		for(int star=0;star<n;star++)
		{
			System.out.print("* ");
		}
			row++;
			System.out.println();
			continue;
		}
	
	else {
		for(int stars=0;stars<nst;stars++)
		{
			System.out.print("* ");
		}
		for(int space=0;space<nsp;space++)
		{
			System.out.print("  ");
		}
		for(int star=0;star<nst;star++)
		{
			System.out.print("* ");
		}
	}
		if(row<n/2)
		{
			nst--;
			nsp+=2;
		}
		else {
			nst+=1;
			nsp-=2;
		}
		row++;
		System.out.println();
	}
}
	}