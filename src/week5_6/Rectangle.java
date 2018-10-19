package week5_6;

public class Rectangle extends Shape {
	private double dai, rong;
	private int x, y;
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getDai() {
		return dai;
	}

	public void setDai(double dai) {
		this.dai = dai;
	}

	public double getRong() {
		return rong;
	}

	public void setRong(double rong) {
		this.rong = rong;
	}
	
	public Rectangle(String color, boolean filled, double dai, double rong) {
		super(color, filled);
		this.dai =dai;
		this.rong = rong;
	}
	
	public double diettich() {
		return dai*rong;
	}
	public void Rectangle(double dai, double rong) {
		this.dai= dai;
		this.rong = rong;
		
	}
	public String toString() {
		return super.toString()+ "vi tri" +" "+ "("+ getX()+","+ getY()+")";
	}
	
}
