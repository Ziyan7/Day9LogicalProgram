package Day9LogicalProgram;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();  //to obtain input n
		int sum=0;
		for(int i=1;i<n;i++)  
		{
			if(n%i==0)	//To obtain divisors of number
			{
				sum+=i;  //sum of divisors
			}
		}
		if(sum==n)  //check if sum is equal to number
		{
			System.out.println(n+" is a perfect number");
		}
		else
			System.out.println(n+" is not a perfect number");
		sc.close();
	}

}
