﻿/*package week3;

public class Week3 {
	public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
		if(m>n) {
			return m;
		}
		else
			return n;
    }

    public static int minOfArray(int[] array) {
    	int min=array[0];
    	for(int i=0;i<array.length;i++) {
    		if(array[i]<min) {
    			min=array[i];
    		}
    	}
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     *//*
    public static String calculateBMI(double weight, double height) {
    	double  BMI = weight/(height*height);
    	if(BMI<18.5 ) {
    		return "thieu can";
    	}
    	else if(BMI>=18.5&& BMI<23) {
    		return "Binh Thuong";
    	}
    	else if(BMI>=23&& BMI<25) {
    		return "Thua can";
    	}
    	else  {
    		return "Beo phi";
    	}
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        return null;
    }
}
*/
package week3;

public class Week3 {

	public static int max(int m, int n) {
		// TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
		if(m > n)
			return m;
		return n;
	}

	public static int minOfArray(int[] array) {
		// TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
		int min = array[0];
		for(int i=1;i<array.length; i++)
			if(array[i] < min)
				min = array[i];
		return min;
	}

	/**
	 * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
	 * @param weight cân nặng
	 * @param height chiều cao
	 * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
	 */
	public static String calculateBMI(double weight, double height) {
		// TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
		double BMI = weight/(height * height);
		if(BMI < 18.5)
			return "thieu can";
		else if(BMI >= 18.5 && BMI < 23)
			return "Binh Thuong";
		else if(BMI >= 23 && BMI <=25)
			return "Thua can";
		else
			return "Beo phi";
	}
}
