package Method_overloading;

public class Square_Area {
public void area(double side) {
	System.out.println("Area of square:"+ side*side);
}
public void area(float side) {
	System.out.println("Area of square:"+ side*side);
}

public static void main(String[] args) {
	Square_Area a = new Square_Area();
	a.area(4.2);
	a.area(10);
}
}
