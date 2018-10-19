package week5_6;

import java.util.*;

public class Triangle extends Shape {
	private int canh1, canh2 , canh3;
	private int x,y;	
	public int getCanh1() {
		return canh1;
	}

	public void setCanh1(int canh1) {
		this.canh1 = canh1;
	}

	public int getCanh2() {
		return canh2;
	}

	public void setCanh2(int canh2) {
		this.canh2 = canh2;
	}

	public int getCanh3() {
		return canh3;
	}

	public void setCanh3(int canh3) {
		this.canh3 = canh3;
	}

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

	public Triangle(String color, boolean filled , int canh1, int canh2, int canh3, int x, int y) {
		super(color, filled);
		this.canh1 = canh1;
		this.canh2 = canh2;
		this.canh3 = canh3;
		this.x = x;
		this.y = y;
	}
	
	public int chuvi() {
		return canh1+canh2+canh3;
	}
	public double dientichtamgiac() {
		double nuachuvi =(double)chuvi()/2;
		return  Math.sqrt(nuachuvi*(nuachuvi-canh1)*(nuachuvi-canh2)*(nuachuvi-canh3));
	}
}
