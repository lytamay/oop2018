package week5_6;

import java.util.*;


public class Circle extends Shape {
	
	private int x,y, R;
	
	public Circle(String color , boolean filled , int x, int y, int R) {
		super(color,filled);
		this.x = x;
		this.y= y;
		this.R = R;
	}
	public boolean isFilled() {
		return super.isFilled();
	}
	
	public String getColor() {
		return super.getColor();
	}
	
	@Override
	public void setColor(String color) {
		super.setColor(color);
	}
	
	public void setR(int R) {
		this.R = R;
	}
	public int getR() {
		return R;
	}
	
	
	
}
