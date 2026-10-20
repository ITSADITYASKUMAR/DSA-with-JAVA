package LEC23;

public class First {
	int tos= -1;
	int size=0;
	int arr[] = new int [5];
	public void push(int val)
	{
		if (size == arr.length)
		{
			System.out.println("Stack full h");
			return;
		}
		tos++;
		arr[tos] = val;
		size++;
//		tos++;
	}
	public int pop()
	{if (tos == -1)
	{
		System.out.println("Stack khali hai");
		return -1;
	}
		int temp = arr[tos];
		tos--;
		return temp;
	}
	public int peek()
	{
		if (tos ==-1)
		{
			System.out.println("Stack is empty");
			return-1;
		}
		return arr[tos];
	}
	public void display()
	{
		for (int i = tos; i >= 0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

