package week5_6;

import java.util.*;

import javax.swing.JPopupMenu.Separator;


public class Square extends Rectangle{
	
	private  int x, y;
	
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


	public void Square(double dai) {
		super.setDai(dai);
		super.setRong(dai);
	}
	
	
	public Square(String color, boolean filled, double dai, double rong , int x, int y) {
		
		super(color,filled, dai, dai);
		this.x=x;
		this.y=y;
	}
	
	public double dientich() {
		return super.getDai()*super.getRong();
	}
	
	public String toString() {
		return 
	}
}
