package Day9LogicalProgram;

import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();	//@parameter n number which has to be reversed
		int num=n;
		int reverse=0,rem=0;
		/* number can be reversed by taking the modulo of the number
		 * by 10 and multiplying the modulo value to 10 and adding it
		 */
		while(n>0)
		{
			rem=n%10;
			reverse=reverse*10+rem;   
			n=n/10;
		}
		System.out.println("Reverse of "+num+" is "+reverse);
		sc.close();
	}

}