package week10;

import java.util.Random;

public class Task2 {
    private double[] a = new double[1000];
    public void ArrayRandom(){
        Random rd = new Random();
        for(int i=0;i<1000;i++){
            a[i] = rd.nextDouble();
        }
    }
    public void SortArray(){
        for(int i=0;i<1000-1;i++){
            for(int j=1000-1;j>i;j--){
                if(a[j]<a[j-1]){
                    double temp = a[j];
                    a[j]= a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }
    public void xuat(){
        for(int i=0;i<1000 ;i++){
            System.out.println(i+"  "+ a[i]);
        }
    }
    public static void main(String[] args){
        Task2 t = new Task2();
        t.ArrayRandom();
        t.SortArray();
        t.xuat();
    }
}
