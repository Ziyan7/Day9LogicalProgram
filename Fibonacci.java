package Day9LogicalProgram;

import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();   //input value 
		int i=1,first_value=0,second_value=1,Sum_value=0;
		System.out.println("The fibonacci series for "+n+" is");
		while(i<=n)
		{
			System.out.print(first_value+" ");
			Sum_value=first_value+second_value;  //to store the sum of previous two values
			first_value=second_value;				//moving to previous value
			second_value=Sum_value;				//moving sum to second value
			i++;
		}
		sc.close();
	}
	
}