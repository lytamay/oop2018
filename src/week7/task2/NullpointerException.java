package week7.task2;
import java.lang.Exception;
import java.lang.NullPointerException;

public class NullpointerException {
	public int[] a;
	public int Nullpoiter() throws NullPointerException{
		return a.length;
	}
	public static void main(String[] args) {
		try {
			NullpointerException nu = new NullpointerException();
			System.out.println(nu.Nullpoiter());
		} catch (Exception e) {
			System.out.println("loi NullpoiterException");
			System.out.println(e.toString());
		}
	}

}
