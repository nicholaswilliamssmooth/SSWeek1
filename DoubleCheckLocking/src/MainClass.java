/** 
 * Create a thread safe singleton through the double lock method.
 */

/**
 * @author Nicholas Williams
 *
 */
public class MainClass {
	
	volatile private static MainClass instanceSingleton = null;
	
	private MainClass() {}

	/** Implements a double lock to make instancing the class thread safe
	 */
	public static MainClass getSingleInstance() {
		
		if (instanceSingleton == null) { // Second lock
			// Block level synchronization, do this so we don't need to lock the whole method or class
			synchronized (instanceSingleton) {
				if (instanceSingleton == null) { // First lock
					instanceSingleton = new MainClass();
				}
			}
		}
		return instanceSingleton;

	}

}
