package Day9LogicalProgram;

import java.util.*;
public class CouponNumber {
	public static Random random = new Random();  //to generate random numbers
	public static int n;
	public static ArrayList<Integer> distinct=new ArrayList<>(); //to store n distinct numbers
    public static int  randomNumber()	//method to get random integer
    {
    	return random.nextInt(10);        //return to get random integer between 0 to 10
    }
    public static boolean process(int x)	//To check if the random number is present in coupon or not
    {
    	int index=distinct.indexOf(x);	//check whether random number is in coupon
    	if(index!=-1)
    	{
    		distinct.remove(index);   //remove the number from array
    		return true;
    	}
    	else return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();    //parameter n indicates number of distinct numbers in coupon
       System.out.println("Enter the "+n+" distinct coupon numbers");
       for(int i=0;i<n;i++)
    	   distinct.add(sc.nextInt());		//arraylist contains coupon numbers
       int count=0,no_of_random=0;
       while(count<n)   //iterate till all numbers are obtained
       {
    	   while(true)
    	   {
    		   int x=randomNumber();    //get random number
    		   //System.out.println(x);
    		   no_of_random++;			//counting random numbers
    		   boolean ps=process(x);  //to check if its present
    		   if(ps)
    			   break;
    	   }
    	   count++;
    	   
    	   
       }
       System.out.println("Number of random numbers is "+no_of_random);
       
       
       
	}

}