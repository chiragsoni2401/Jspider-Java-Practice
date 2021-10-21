
public class Thread1  extends Thread
{
	//Has-A relationship
	ThreadDemo d1 = null;
	public Thread1(ThreadDemo d) 
	{
		d1 = d;
	}
	
	@Override
	public void run()
	{
		System.out.println("inside thread1");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			d1.bye();
			
		}
	
	}
}
