package prob6;

public class Rectangle extends Shape implements Resizable {
	double i = 0;
	double j = 0;
	
	public Rectangle(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public double getArea() {
		super.area = i * j;
		return super.area;
	};
	
	public double getPerimeter() {
		super.perimeter = (double)(i + j) * 2;
		return super.perimeter;
	}

	@Override
	public void resize(double a) {
		// TODO Auto-generated method stub
		this.i = (double)i * a;
		this.j = (double)j * a;
	};
}
