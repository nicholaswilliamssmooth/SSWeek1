/** 
 * Makes two threads and puts them in a deadlock 
 * 
 */

/**
 * @author Nicholas Williams
 *
 */
public class MainClass {
	
	private static String obj1 = "Thread object number 1";
	private static String obj2 = "Thread object number 2";
	
	/*
	 * @param args arguments aren't used for this program
	 */
	public static void main(String[] args) {

		// Override these in main so we can use the object variables above
		ThreadTest t1 = new ThreadTest() {
			@Override
			public void run() {
				 try {
						synchronized (obj1) {
							Thread.sleep(1000);
				        	synchronized (obj2) {
					            System.out.println("Fully locked");
				        	}
					    }
			        }
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		
		// Thread2 will try to access obj2 while Thread1 is still doing work with it, 
		// Which will make Thread2 halt and not be able to do work, which will loop and hault
		// Thread1 as well
		ThreadTest t2 = new ThreadTest() {
			@Override
			public void run() {
				 try {
						synchronized (obj2) {
							Thread.sleep(1000);
				        	synchronized (obj1) {
					            System.out.println("Fully locked");
				        	}
					    }
			        }
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		
		// Start both threads now that they're initialized above
        t1.start();
        t2.start();

	}

}
