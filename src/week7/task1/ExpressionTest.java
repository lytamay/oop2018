package week7.task1;

public class ExpressionTest {

	public static void main(String[] args) {
		
		System.out.println("(10^2 - 1 + 2*3)^2 ");
		Expression exp  = new square(new numeral(10))  ;
		Expression exp1 = new numeral(1);
		Expression exp2 = new numeral(2);
		Expression exp3 = new numeral(3);
		
		Expression exp4 = new Multiplication(exp2, exp3);
		Expression exp5 = new Subtraction(exp, exp1);
		
		Expression exp6 = new addTion(exp5, exp4);
		Expression exp7 = new square(exp6);
		
		System.out.println("Bieu thuc sau khi viet la ");
		
		System.out.println( exp7.toString());
		
		Expression ex1 = new numeral(20);
		Expression ex2 = new numeral(0);
		try{
		Expression exp8 = new Division(ex1, ex2);
		System.out.println(exp8.evaluate());
		}catch(ArithmeticException e) {
			System.out.println("loi chi cho 0");
		}	
	}

}
