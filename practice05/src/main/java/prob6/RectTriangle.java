package prob6;

public class RectTriangle extends Shape {
	double i = 0;
	double j = 0;
	
	public RectTriangle(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public double getArea() {
		super.area = i + j + Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));
		return super.area;
	};
	
	public double getPerimeter() {
		super.area = i * j * 1/2;
		return super.perimeter;
	};
	

}
