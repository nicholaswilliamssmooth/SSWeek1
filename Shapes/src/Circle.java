public class Circle implements Shape {
	private Double radius;
	
	Circle(Double r) {
		radius = r;
	}
	
	public Double calculateArea() {
		return Math.PI * (radius * radius);
	}
	
	public void display() {
		System.out.print("Radius: " + radius + "\nDiameter: " +  radius*2);
	}
}
