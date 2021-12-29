public class PointClassAssignment {
	public static void main(String[] args) {
		Point[] myPoints = new Point[2];
		myPoints[0] = new Point(2, 3);
		myPoints[1] = new Point(5, 6);
		Point midpoint = myPoints[0].midpoint(myPoints[1]);
		
		for (Point c : myPoints) {
			System.out.print(c);
			System.out.println();
		}
		
		System.out.println("The slope is " + myPoints[0].slope(myPoints[1]));
		System.out.println("The distance is " + myPoints[0].slope(myPoints[1]));
		System.out.println("The distance from the origin for point 1 is " + myPoints[0].distanceFromOrigin());
		System.out.println("The distance from the origin for point 2 is " + myPoints[1].distanceFromOrigin());
		System.out.println("The midpoint is " + midpoint);
	}
}

class Point {
	private double x;
	private double y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public void setX() {
		this.x = x;
	}
	
	public void setY() {
		this.y = y;
	}
	
	public double slope(Point other) {
		double top = this.y - other.y;
		double bottom = this.x - other.x;
		return top / bottom;
	}
	
	public double distance(Point other) {
		double distance1 = Math.pow(this.x - other.x, 2);
		double distance2 = Math.pow(this.y - other.y, 2);
		return Math.sqrt(distance1 + distance2);
	}
	
	public double distanceFromOrigin() {
		double x2 = Math.pow(this.x, 2);
		double y2 = Math.pow(this.y, 2);
		return Math.sqrt(x2 + y2);
	}
	
	public Point midpoint(Point other) {
		double x = (this.x + other.x) / 2;
		double y = (this.y + other.y) / 2;
		Point result = new Point(x, y);
		return result;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}