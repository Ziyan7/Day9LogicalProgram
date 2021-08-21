package Day9LogicalProgram;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt(); 
		int s=0; //flag to check if number is prime
		if(n==2)
			System.out.println(n+" is a prime number"); // 2 is a prime number
		else if(n>2)
		{
			for(int i=2;i<n/2;i++)  //to iterate 
			{
				if(n%i==0) //if number is divisible by any number excluding 1 and itself
					{
					s=1;
					break;
					}
				    
			}
			if(s==0)   //check if flag is zero
				System.out.println(n+" is a prime number");
			else
				System.out.println(n+" is not a prime number");
		}
		else 
			System.out.println("Enter number greater than 2");
		sc.close();
	}

}