package week11;

import java.util.ArrayList;

public class Task1 {
    public static <T extends Comparable> void Sort(T[] t){
        for(int i=0;i< t.length-1;i++){
            for(int j=t.length-1;j>i;j--){
                if(t[j].compareTo(t[j-1])>0){
                    T temp = t[j] ;
                    t[j] = t[j-1];
                    t[j-1] = temp;
                }
            }
        }
    }
    public static void main(String [] args) {
        // tao cac doi tuong ;
        Integer[] in = {4,5,6,8,7,0};
        Double[] dou = {3.5,6.5,7.0,2.4,5.2};
        Long[] l = {1l,4l,7l,3l};
        Float[] f = {6.4f, 5.7f,8.8f};

        // sap xep;
        Sort(in);
        for (int i=0;i<in.length;i++){
            System.out.print(in[i]+" ");
        }
        System.out.println("\n");
        Sort(dou);
        for (int i=0;i<dou.length;i++){
            System.out.print(dou[i] + " ");
        }
        System.out.println("\n");
        Sort(l);
        for (int i=0;i<l.length;i++){
            System.out.print(l[i]+" ");
        }
        System.out.println("\n");
        Sort(f);
        for (int i=0;i<f.length ;i++){
            System.out.print(f[i]+ " ");
        }
    }
}


