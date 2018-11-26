import java.util.Scanner;

class Session4Prg2
{
	public static void  main(String a[])
	{
		
		final int SIZE = 10;
		int arr[] = new int[SIZE];
		
		
		System.out.println("Enter list of 10 integer numbers:");		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<SIZE;i++)
		{
  		arr[i] = sc.nextInt();//it will wait for 10 inputs
 		} 

		// this loop will print the array
		for(int i=0;i<SIZE;i++)
		{
		System.out.println("The array index[" +(i+1) +"]:"  +arr[i]);
		}

		System.out.println("");
		for(int i=0;i<SIZE;i++)
		{
		if (arr[i] % 2 == 0)
		{
		System.out.println("The even number from array list is:"  +arr[i]);
		}
		}

	}
}