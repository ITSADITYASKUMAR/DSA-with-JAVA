package Lec12;
import java.util.Scanner;
public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int [3][];
Scanner scn = new Scanner(System.in);
for(int row=0; row<arr.length; row++)
{
	System.out.println("Enter the no. of cols for row" +row);
	int n =scn.nextInt();
	arr[row]=new int[n];
	for (int col = 0; col< arr[row].length; col++)
	{
		System.out.println("Enter the value for row" +row+"col" +col);
		arr[row][col] = scn.nextInt();
	}
}

	}

}
