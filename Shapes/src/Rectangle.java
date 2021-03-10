public class Rectangle implements Shape {
	
	private Double width;
	private Double height;
	
	Rectangle(Double w, Double h) {
		width = w;
		height = h;
	}
	
	public Double calculateArea() {
		return width * height;
	}
	
	public void display() {
		System.out.print("Width: " + width + "\nHeight: " +  height);
	}
}
