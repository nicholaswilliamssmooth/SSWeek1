public class Triangle implements Shape {
	private Double base;
	private Double height;
	
	Triangle(Double b, Double h) {
		base = b;
		height = h;
	}
	
	public Double calculateArea() {
		return base * height / 2;
	}
	
	public void display() {
		System.out.print("Base: " + base + "\nHeight: " +  height);
	}
}
