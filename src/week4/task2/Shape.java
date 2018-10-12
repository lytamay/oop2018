package week4.task2;

public class Shape {
	private String color;
    private boolean filled;

    // ham tao filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // kiem tra
    public boolean isFilled() {
        return filled;
    }

    // thiet lap mau
    public void setColor(String color) {
        this.color = color;
    }

    // tra ve mau
    public String getColor() {
        return color;
    }

    // khoi tao k co tham so
    public  Shape() {
        this.color = "red";
        this.filled = true;

    }

    // khoi tao co hai tham so
    public  Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // phuong thuc lay thong tin cua hinh
    public String toString() {
        return "Color " + this.color + "  " + "filled  " + this.filled;
    }

}
