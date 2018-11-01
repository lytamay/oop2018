package week7.task2;
import java.lang.ClassCastException;

public class ClasscastException {

	public static void main(String[] args) {
		
		try {
			thu t= new thu();
			System.out.println("chuong trinh chay binh thuong");
		} catch (Exception e) {
			System.out.println("loi classcastException");
			// TODO: handle exception
		}
	}

}

class animal{
	public animal() {
		
	}
}
class dog extends animal{
	public dog() {
		
	}
}

class thu {
	public thu() throws ClassCastException {
		animal p= new animal();
		dog Con = new dog();
		dog c1 = (dog)p ;
	}
	
}