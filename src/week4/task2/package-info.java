///**
// * Package bài làm cho Câu 2
// * TODO: Khai báo các class, thuộc tính và phương thức như biểu đồ lớp của Câu 2. 1 file chỉ khai báo 1 class
// * TODO: Viết comment và khai báo getter, setter đầy đủ như yêu cầu ở Câu 1
// * TODO: Sử dụng số PI tự định nghĩa dùng cho các phương thức getArea() và getPerimeter()
// * @author cuong
// * @version 0.1
// */
//
//
//package week4.task2;
//
//import java.*;
// class Shape {
//    private String color;
//    private boolean filled;
//
//    // ham tao filled
//    public void setFilled(boolean filled) {
//        this.filled = filled;
//    }
//
//    // kiem tra
//    public boolean isFilled() {
//        return filled;
//    }
//
//    // thiet lap mau
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    // tra ve mau
//    public String getColor() {
//        return color;
//    }
//
//    // khoi tao k co tham so
//    public  Shape() {
//        this.color = "red";
//        this.filled = true;
//
//    }
//
//    // khoi tao co hai tham so
//    public  Shape(String color, boolean filled) {
//        this.color = color;
//        this.filled = filled;
//    }
//
//    // phuong thuc lay thong tin cua hinh
//    public String toString() {
//        return "Color" + this.color + " " + "filled" + this.filled;
//    }
//}
//
//class Circle extends Shape {
//    private double radius;
//    // khoi tao pi
//    public static final double Pi = 3.14;
//
//    // thiet lap radius;
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    // tra ve ban kinh;
//    public double getRadius() {
//        return this.radius;
//    }
//
//    // ham khoi tao k co tham so;
//    public void Circle() {
//        radius = 1.0;
//    }
//
//    // ham khoi tao co tham so ban kinh
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    // ham  khoi tao co tham so ban kinh , mau , trang thai day;
//    public  Circle(double radius, String color, boolean filled) {
//        this.radius = radius;
//        super(color, filled);
//    }
//
//    // tinh dien tich hinh tron;
//    public double getArea() {
//        return this.radius * this.radius * Pi;
//    }
//    // tinh chu vi hinh tron
//    public double getPerimeter() {
//        return 2 * this.radius * Pi;
//    }
//
//    // tra ve thong tin hinh tron
//    public String toString() {
//        return "ban kinh " + this.radius + " " + super.toString();
//    }
//}
//
//class Rectangle extends Shape{
//   private double  width ;
//    private double lenght ;
//    // ham khoi tao k co tham so
//    public  Rectangle(){
//        width = 1.0;
//        lenght= 1.0;
//    }
//    // ham khoi tao co tham so chieu rong, dai,
//    public Rectangle (double width, double lenght){
//        this.width = width;
//        this.lenght = lenght;
//    }
//    // ham khoi tao 4 tham so
//    public Rectangle (double width , double lenght, String color, boolean filled){
//        this.width =width;
//        this.lenght = lenght;
//        super(color,filled);
//    }
//    // khoi tao chieu rong
//    public void setWidth(double width) {
//        this.width = width;
//    }
//    // khoi tao chieu dai
//    public void setLenght(double lenght) {
//        this.lenght = lenght;
//    }
//    // tra ve do dai cau chieu dai
//    public double getLenght() {
//        return lenght;
//    }
//    // tra ve chieu dai cua chieu rong
//    public double getWidth() {
//        return width;
//    }
//    // tinh dien tich  hinh chu nhat
//    public double getArea(){
//        return  this.width* this.lenght;
//    }
//    // chu vi hinh chu nhat
//    public  double getPerimeter(){
//        return 2*(this.width+this.lenght);
//    }
//    public String toString(){
//        return "chieu rong"+ this.width+ " chieu dai"+this.lenght + super.toString();
//    }
//}
//
//class Square extends Rectangle {
//    // khoi tao hinh vuong k co tham so
//    public void Square() {
//        super(2.0, 2.0);
//    }
//    // phuong thuc khoi tao co mot phuong thuc;
//    public Square(double side){
//        super(side, side);
//    }
//    // phuong thuc khoi tao co tham so
//    public void Square(double side, String color, boolean filled) {
//        super(side, side, color, filled);
//    }
//
//    // khoi tao co 1  do dai hinh vuong
//    public void setSide(double side) {
//        super.setWidth(side);
//        super.setLenght(side);
//    }
//
//    // tra ve do dai hinh vuong
//    public double getSide() {
//        return super.getLenght();
//    }
//    // khoi tao do rong cua hinh vuong
//    public void setWidth(double side) {
//        super.setWidth(side);
//    }
//    // khoi tao chieu dai cau hinh vuong
//    public void setLength(double side) {
//        super.setLenght(side);
//    }
//    // tra ve thong tin cua hinh vuong;
//    public  String toString(){
//        return super.toString();
//    }
//}
//class main{
//public static void main(String[] args){
//        Shape shape=new Shape("red", true);
//        shape.setColor("black");
//        shape.setFilled(false);
//        System.out.println(shape.toString());
//
//        Circle circle=new Circle(2.0);
//        System.out.println("diet tich hinh tron"+circle.getArea());
//        System.out.println("chu vi hinh tron"+circle.getPerimeter());
//        System.out.println("thong tin hinh tron"+circle.toString());
//
//        Rectangle rectangle=new Rectangle(3.5, 5.6);
//        System.out.println("diet tich hinh chu nhat la "+rectangle.getArea());
//        System.out.println("chu vi hinh chu nhat la "+rectangle.getPerimeter());
//        System.out.println("thong tin hinh chu nhat la "+rectangle.toString());
//
//        Square square=new Square(1.0);
//        System.out.println("do dai canh hinh vuong la "+square.getSide());
//        System.out.println("thong tin hinhh vuong la: "+square.toString());
//        return 0;
//        }
//}