package q9_threads;
import java.util.*;
public class Process1 extends Thread{

	String word;
	String vowels = "aAeEIiOoUu";
	
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		word = sc.nextLine();
		
		int count = 0;
	    for(char w: word.toCharArray())
	    {
	    	for(char c: vowels.toCharArray())
	    		if(w == c) count++;
	    	
	    }
	    
	    System.out.println("Number of vowels in the word "+word+"is = "+count);
	}
	

}
