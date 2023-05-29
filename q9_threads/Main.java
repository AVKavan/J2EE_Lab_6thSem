package q9_threads;

public class Main {
    
	public static void main(String args[]) throws InterruptedException
	{
		Process1 p1 = new Process1();
		Process2 p2 = new Process2();
		
		p1.start();
		Thread.sleep(5000);
		
		p2.start();
	}
}
