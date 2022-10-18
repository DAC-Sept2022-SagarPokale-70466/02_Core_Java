class hi1 implements Runnable
{
	public void run()
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Hiii");
			try{ Thread.sleep(600); } catch(Exception e) {}		// To achive sleep
		}
	}
}
class hello1 implements Runnable
{
	public void run()
	{
		for(int i = 0; i < 5; i++)
		{	
			System.out.println("Hello");
			try{ Thread.sleep(600); } catch(Exception e) {}
		}
	}
	
}


public class runnable_interface{

	public static void main(String[] args) throws Exception
	{
				
		Runnable obj1 = new hi1();			// Interface Reference for creating object
		Runnable obj2 = new hello1();
		
		Thread t1 = new Thread(obj1);		// passing obj in Thread constructor
		Thread t2 = new Thread(obj2);
		
		t1.setName("HI Thread");
		t2.setName("Hello Thread");
		
		t1.setPriority(9);	//(Thread.MAX_PRIORITY);
		t2.setPriority(1);	//(THread.MIN_PRIORITY);
		
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		//obj1.start();
		t1.start();
		try{ Thread.sleep(100); } catch(Exception e) {}
		//obj2.start();
		t2.start();
		
		t1.join();		// This will wait for main method
		t2.join();
		
		System.out.println("Bye");
		
	}

}
