package week4.task2;

public class Rectangle extends Shape {
	
	 private double  width ;
	    private double lenght ;
	    // ham khoi tao k co tham so
	    public  Rectangle(){
	        width = 1.0;
	        lenght= 1.0;
	    }
	    // ham khoi tao co tham so chieu rong, dai,
	    public Rectangle (double width, double lenght){
	        this.width = width;
	        this.lenght = lenght;
	    }
	    // ham khoi tao 4 tham so
	    public Rectangle (double width , double lenght, String color, boolean filled){
	    	super(color,filled);
	        this.width =width;
	        this.lenght = lenght;
	       
	    }
	    // khoi tao chieu rong
	    public void setWidth(double width) {
	        this.width = width;
	    }
	    // khoi tao chieu dai
	    public void setLenght(double lenght) {
	        this.lenght = lenght;
	    }
	    // tra ve do dai cau chieu dai
	    public double getLenght() {
	        return lenght;
	    }
	    // tra ve chieu dai cua chieu rong
	    public double getWidth() {
	        return width;
	    }
	    // tinh dien tich  hinh chu nhat
	    public double getArea(){
	        return  this.width* this.lenght;
	    }
	    // chu vi hinh chu nhat
	    public  double getPerimeter(){
	        return 2*(this.width+this.lenght);
	    }
	    public String toString(){
	        return "chieu rong "+ this.width + " chieu dai  "+this.lenght+" " + super.toString();
	    }

}
