package week7.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IOException {
	public void file1() throws java.io.IOException{
		BufferedReader bufferedReader = new BufferedReader(new FileReader("docfile.txt"));
		String s = bufferedReader.readLine();
	}
	public static void main(String[] args) {
		try {
			IOException Io = new IOException();
			Io.file1();
			//System.out.println(Io.file1());
		} catch (Exception e) {
			System.out.println(e.toString());
			// TODO: handle exception
		}
	}

}
