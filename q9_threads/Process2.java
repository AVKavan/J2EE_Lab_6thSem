package q9_threads;
import java.util.*;
public class Process2 extends Thread{
	
	String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	String number;
	
	Scanner sc = new Scanner(System.in);
	
	public void run()
	{
		System.out.println("\nEnter a number not less than 4 digits");
		number = sc.next();
		
		for(char c: number.toCharArray())
		{
			int i = (int)c - 48;
			System.out.print(" "+digits[i]);
		}
		System.out.println();
	}

}
