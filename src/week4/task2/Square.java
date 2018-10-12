package week4.task2;

public class Square extends Rectangle{
	// khoi tao hinh vuong k co tham so
    public void Square() {
        super.setWidth(2.0);
        super.setLenght(2.0);
        
    }
    // phuong thuc khoi tao co mot phuong thuc;
    public Square(double side){
        super(side, side);
    }
    // phuong thuc khoi tao co tham so
    public void Square(double side, String color, boolean filled) {
        super.setWidth(side);
        super.setLenght(side);
        super.setColor(color);
        super.setFilled(filled);
    }

    // khoi tao co 1  do dai hinh vuong
    public void setSide(double side) {
        super.setWidth(side);
        super.setLenght(side);
    }

    // tra ve do dai hinh vuong
    public double getSide() {
        return super.getLenght();
    }
    // khoi tao do rong cua hinh vuong
    public void setWidth(double side) {
        super.setWidth(side);
    }
    // khoi tao chieu dai cau hinh vuong
    public void setLength(double side) {
        super.setLenght(side);
    }
    // tra ve thong tin cua hinh vuong;
    public  String toString(){
        return super.toString();
    }

}
