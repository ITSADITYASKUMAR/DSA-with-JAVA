package Lec6;

import java.util.Scanner;

public class AnyToAny {
static int a=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int curBase=scn.nextInt();
int val=scn.nextInt();
int a=10;
System.out.println(a);;
int expectedBase=scn.nextInt();
if(curBase==10&&expectedBase==2)
{
	int res=solve(curBase,val,expectedBase);
System.out.println(res);
}
else if(curBase==2&&expectedBase==10)
{
	int res=solve(curBase,val,expectedBase);
System.out.println(res);
}
else if(curBase==2&&expectedBase==8)
{
	int res=solve(curBase,val,10);
int ans=solve(10,res,8);

}
else if(curBase==8&&expectedBase==2)
{
	int res=solve(curBase,val,10);
	int ans=solve(10,res,2);

}
	}
public static int solve(int curBase,int val,int expectedBase)
{
	int ans=0;
	int multi=1;
	while(val>0)
	{
		int rem=val%expectedBase;
		ans+=rem*multi;
		multi=multi*curBase;
	val=val/expectedBase;
	}
	return ans;
//	System.out.println("Hello");
}

}