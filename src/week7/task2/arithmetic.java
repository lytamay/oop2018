package week7.task2;
import java.lang.Exception;

public class arithmetic {
	// loi chia cho 0;
	public int  a;
	public int  b;
	
	public arithmetic(int a, int b) {
		this.a =a ;
		this.b =b;
	}
	public int tinhchia() throws ArithmeticException{
		return a/b;
		
	}
	public static void main(String[] args) {
		try {
			arithmetic c = new arithmetic(15, 0);
			System.out.println(c.tinhchia());
		} catch (Exception e) {
			System.out.println("loi chia cho 0");
			System.out.println(e.toString());
		}

	}

}
