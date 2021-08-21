package Day9LogicalProgram;

import java.util.*;
public class StopWatch {
public static long startTime,stopTime;   //declaration of start time and stop time
public static void startTimer()			//method to start the timer
{
	startTime=System.currentTimeMillis();   //to get current time in milliseconds from the system
	System.out.println("Stop watch has been started!!!!");
	System.out.println("Start time is "+startTime+" milliseconds");
}
public static void stopTimer()		//method to stop the timer
{
	stopTime=System.currentTimeMillis();	 //to get current time in milliseconds from the system
	System.out.println("Stop watch has been stopped!!!!");
	System.out.println("Stop time is "+stopTime+ " milliseconds");
}

public static long getElapsedTime()  //method to get the elapsed time between start and stop
{
	return stopTime-startTime;		//returns the difference between start and stop time 
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to start the timer");
		int n=sc.nextInt();
		if(n==1)
			startTimer();
		System.out.println("Press 2 to stop the timer");
		n=sc.nextInt();
		if(n==2)
		{
			stopTimer();
			System.out.println("the elapsed time between start and end is "+getElapsedTime()+" milliseconds");
		}
		sc.close();
	}

}