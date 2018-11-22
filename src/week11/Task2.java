package week11;

public class Task2 {
    public static<T extends Comparable> T Max(T[] t){
        T max = t[0];
        for(int i=0;i<t.length;i++){
            if(max.compareTo(t[i])<0){
                max =t[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Integer[] in = {4,5,6,8,7,0};
        Double[] dou = {3.5,6.5,7.0,2.4,5.2};
        Long[] l = {1l,4l,7l,3l};
        Float[] f = {6.4f, 5.7f,8.8f};

        // tim max ;
        System.out.println("Int = " + Max(in));
        System.out.println("DOU = "+ Max(dou));
        System.out.println("l = " + Max(l));
        System.out.println("f = " + Max(f));
    }
}
