package week7.task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilenotFoundException {

		public void file1() throws FileNotFoundException{
			BufferedReader bufferedReader = new BufferedReader(new FileReader("docfile.txt"));
		}
		public static void main(String[] args) {
			try {
				FilenotFoundException Io = new FilenotFoundException();
				Io.file1();
				//System.out.println(Io.file1());
			} catch (Exception e) {
				System.out.println(e.toString());
				System.out.println("loi khong tim thay file");
			}
		}
}
