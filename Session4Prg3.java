import java.util.Scanner;
 
class NegativeAgeException extends Exception
{
 
	public NegativeAgeException(String str) {
  	System.out.println(str);
 	}
}

public class Session4Prg3
{
 
 	public static void main(String[] args)
	{
  		Scanner s = new Scanner(System.in);
  		System.out.print("Enter the value for age: ");
  		int age = s.nextInt();
  
  		try {
   			if(age < 0) 
    			throw new NegativeAgeException("Invalid Age!!!");
   			else
    			System.out.println("Valid Age");
  		}
  		catch (NegativeAgeException a) {
   		System.out.println(a);
  		}
 	}
}