/**
 * A small program demonstrating interfaces with some shape objects
 */

/**
 * @author Nicholas Williams
 *
 */
public class MainClass {

	/**
	 * Creates some shapes and displays output
	 * @param args args do nothing this program
	 */
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5.0, 4.2);
		Triangle tri = new Triangle(3.0, 9.0);
		Circle circ = new Circle(1.5);
		
		System.out.println("Triangle:");
		tri.display();
		System.out.println("\nArea: " + tri.calculateArea());

		System.out.println("\nRectangle:");
		rect.display();
		System.out.println("\nArea: " + rect.calculateArea());
		
		System.out.println("\nCircle:");
		circ.display();
		System.out.println("\nArea: " + circ.calculateArea());

	}

}
