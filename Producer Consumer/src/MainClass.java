import java.util.Random;

/** A program demonstrating a producer and consumer situation with threads using an array of integers
 * 
 */

/**
 * @author Nicholas Williams
 *
 */
public class MainClass {
	
	final static Integer BUFFER_SIZE = 10;
	static private Integer currAmount = 0; // Makes sense to be static since intuitively there should only be one currAmount


	/**
	 * @param args arguments do nothing for this program
	 */
	public static void main(String[] args) {
		
		Random randNum = new Random();
		Integer buffer[] = new Integer[BUFFER_SIZE];
		
		// Producer adds to the buffer and increments until it hits the limit
		Thread producer = new Thread() {
			@Override
			public void run() {
				while (true) {
					if (currAmount < BUFFER_SIZE -1) {
						buffer[currAmount] = randNum.nextInt(100);
						System.out.println("Added 1 (" + buffer[currAmount] + ") to the stock");
						currAmount++;		
					}
					else {
						try {
							System.out.println("Stock is full, can't produce more");
							Thread.sleep(1);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
				
			}
		};
		// Consumer will consumer from the buffer until it is empty
		Thread consumer = new Thread() {
			@Override
			public void run() {
				while (true) {
					if (currAmount > 0) {
						buffer[currAmount] = randNum.nextInt(100);
						System.out.println("consumer took 1 (" + buffer[currAmount] + ") from the stock");
						currAmount--;
					}
					else {
						try {
							System.out.println("Stock is empty, can't consume anymore");
							Thread.sleep(1);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
		}
		};
		
		producer.start();
		consumer.start();

	}

}
