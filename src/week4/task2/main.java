package week4.task2;

public class main {
	public static void main(String[] args){
        Shape shape=new Shape("red", true);
        shape.setColor("black");
        shape.setFilled(false);
        System.out.println(shape.toString());

        Circle circle=new Circle(2.0);
        System.out.println("diet tich hinh tron "+circle.getArea());
        System.out.println("chu vi hinh tron "+circle.getPerimeter());
        System.out.println("thong tin hinh tron " +circle.toString());

        Rectangle rectangle=new Rectangle(3.5, 5.6);
        System.out.println("diet tich hinh chu nhat la "+rectangle.getArea());
        System.out.println("chu vi hinh chu nhat la "+rectangle.getPerimeter());
        System.out.println("thong tin hinh chu nhat la "+rectangle.toString());

        Square square=new Square(1.0);
        System.out.println("do dai canh hinh vuong la "+square.getSide());
        System.out.println("thong tin hinhh vuong la: "+square.toString());
       
        }

}
