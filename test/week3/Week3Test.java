package week3;
import week3.Week3.java;
import org.junit.Test;
import static org.junit.Assert.*;



public class Week3Test {
    Week3 test =new Week3();
    @Test;
        public void testMax1(){
            assertEquals(9,test.max(7,9));
            assertEquals(20,test.max(20,8));
            assertEquals(19, test.max(15,19 ));
            assertEquals(6, test.max(-1, 6));
            assertEquals(9, test.max(0,9));
        }
        @Test;
        public void testmin(){
            int[] a={4,6,8,5,3,9};
            assertEquals(3,test.minOfArray(a));
            int[] b= { 1,1};
            assertEquals(1,test.minOfArray(b));
            int[] c={66,0,-1,8,9};
            assertEquals(-1,test.minOfArray(c));
            int[] d={100,-11,2,1,-3};
            assertEquals(-11, test.minOfArray(d));
            int[] e={22, 0, 33.4, 7};
            assertEquals(0,test.minOfArray(e));
        }
        public void setBMI(){
            assertEquals("Binh Thuong", test.calculateBMI(52,1.52));
            assertEquals("Beo phi",test.calculateBMI(70, 1.65));
            assertEquals("thieu can",test.calculateBMI(45, 1.63));
            assertEquals("Thua can", test.calculateBMI(60, 1.58));
            assertEquals("Binh Thuong",test.calculateBMI(58, 1.59));
        }

}
