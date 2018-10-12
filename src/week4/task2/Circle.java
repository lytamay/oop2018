package week4.task2;

public class Circle extends Shape{
	private double radius;
    // khoi tao pi
    public static final double Pi = 3.14;

    // thiet lap radius;
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // tra ve ban kinh;
    public double getRadius() {
        return this.radius;
    }

    // ham khoi tao k co tham so;
    public void Circle() {
        radius = 1.0;
    }

    // ham khoi tao co tham so ban kinh
    public Circle(double radius) {
        this.radius = radius;
    }

    // ham  khoi tao co tham so ban kinh , mau , trang thai day;
    public  Circle(double radius, String color, boolean filled) {
    	super(color, filled);
        this.radius = radius;
     
    }

    // tinh dien tich hinh tron;
    public double getArea() {
        return this.radius * this.radius * Pi;
    }
    // tinh chu vi hinh tron
    public double getPerimeter() {
        return 2 * this.radius * Pi;
    }

    // tra ve thong tin hinh tron
    public String toString() {
        return "ban kinh " + this.radius + "  " + super.toString();
    }

}
