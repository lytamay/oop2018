package week3;
import org.junit.Test;
import static org.junit.Assert.*;



public class Week3Test {
        @Test;
        public void testMax1(){
            assertEquals(9,Week3.max(7,9));
            assertEquals(20,Week3.max(20,8));
            assertEquals(19, Week3.max(15,19 ));
            assertEquals(6, Week3.max(-1, 6));
            assertEquals(9, Week3.max(0,9));
        }
        @Test;
        public void testmin(){
            int[] a={4,6,8,5,3,9};
            assertEquals(3,Week3.minOfArray(a));
            int[] b= { 1,1};
            assertEquals(1,Week3.minOfArray(b));
            int[] c={66,0,-1,8,9};
            assertEquals(-1,Week3.minOfArray(c));
            int[] d={100,-11,2,1,-3};
            assertEquals(-11, Week3.minOfArray(d));
            int[] e={22, 0, 33, 7};
            assertEquals(0,Week3.minOfArray(e));
        }

        @Test;
        public void setBMI(){
            assertEquals("Binh Thuong", Week3.calculateBMI(52,1.52));
            assertEquals("Beo phi",Week3.calculateBMI(70, 1.65));
            assertEquals("thieu can",Week3.calculateBMI(45, 1.63));
            assertEquals("Thua can", Week3.calculateBMI(60, 1.58));
            assertEquals("Binh Thuong",Week3.calculateBMI(58, 1.59));
        }

}
