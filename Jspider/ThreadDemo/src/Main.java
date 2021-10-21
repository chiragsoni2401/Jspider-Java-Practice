
public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("************************************");
		ThreadDemo d = new ThreadDemo();
///Three threads are executing three different methods so execution will be fast
		/*
		 * if we don't create threads then main thread will execute all the 3 different methods
		 * but will take more time.
		 */
		Thread1 t2 = new Thread1(d);
		Thread2 t3 = new Thread2(d);
		Thread3 t4 = new Thread3(d);
		t2.start();
		t3.start();
		t4.start();
//because of join currently running thread that is main thread will stop and t4 will join. Once t4 completes its 
//		execution the main method will come into picture again.
		t4.join();
		System.out.println("******************************************");
		
	}

}
