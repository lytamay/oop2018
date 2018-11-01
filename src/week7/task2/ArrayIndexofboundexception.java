package week7.task2;

import  java.lang.ArrayIndexOutOfBoundsException;

public class ArrayIndexofboundexception {
	public int[] arr = {1,7,5,4,8} ;
	public int numberarr() throws ArrayIndexOutOfBoundsException{
		return arr[7];
	}

	public static void main(String[] args) {
		try {
			ArrayIndexofboundexception a= new ArrayIndexofboundexception();
			System.out.println(a.numberarr());
			
		} catch (Exception e) {
			//System.out.println(e.toString());
			System.out.println("loi Arrayindexoutofboundsexception");
		}
	}

}
