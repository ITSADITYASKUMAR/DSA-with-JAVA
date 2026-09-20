package Lec12;
import java.util.Scanner;
public class Construct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= new int [3][3];
Scanner scn = new Scanner(System.in);

for (int row=0; row<arr.length; row++)
{
	for (int col=0; col<arr[row].length; col++)
	{
		System.out.println("Enter the value for row "+row +" col "+ col );
		arr[row][col]=scn.nextInt();
	}
}
	}

}
