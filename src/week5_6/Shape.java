package week5_6;

public class Shape {
	
	private String Color;
	private boolean filled;
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Shape(String color, boolean filled) {
		this.Color = color;
		this.filled = filled;
	}
	public String toString() {
		return "color"+ getColor();
	}
}
