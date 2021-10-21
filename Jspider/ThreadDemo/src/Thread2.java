
public class Thread2  extends Thread
{
     //Has-A relationship
	ThreadDemo d1 = null;
	public Thread2(ThreadDemo d) 
	{
		d1 = d;
	}
	
	@Override
	public void run()
	{
		System.out.println("inside thread2");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			d1.hello();
			
		}
	}
}
