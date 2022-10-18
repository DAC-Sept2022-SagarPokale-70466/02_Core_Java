class hi extends Thread
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
class hello extends Thread
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


public class Multi_Thread{

	public static void main(String[] args) {
		
		hi obj1 = new hi();
		hello obj2 = new hello();
		
		obj1.start();
		try{ Thread.sleep(100); } catch(Exception e) {}
		obj2.start();
		
		
		

	}

}
