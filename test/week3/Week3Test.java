/*package week3;
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

}*/

package week3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax() {
        assertEquals(5, Week3.max(5, 3));
        assertEquals(30, Week3.max(20, 30));
        assertEquals(-3, Week3.max(-3, -10));
        assertEquals(10, Week3.max(10, -3));
        assertEquals(1, Week3.max(1, 0));

    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testminOfArray() {
        int[] testArray1 = {1, 7, 8, 10, -5, 4};
        int[] testArray2 = {-1, 34, 53, 65, 2, 5424, 642, 54, 24, 5, 235, 35, 235, 46};
        int[] testArray3 = {2, 234, 23, 4, 234, 23, 423, 4, -5};
        int[] testArray4 = {2, 54, 23, 4, -100, 134, 32, 234, 24, 2342, 34234, 234, 242, 34, 31, 23, 123, 123, 124, 3, 524, 523, 45, 2, 24, 32, 4, 234, 4, 1};
        int[] testArray5 = {2, 3, 3, 4234, 23, 4234, 34, 2342, 3423, 423, 56, 546, 7, 5, -30, 246, 357, 35, 4, 55, 26, 24, 5342, 4, 523, 42, 534, 5, 2345, 2345, 2345, 24, 5234, 5432, 5, 4};
        assertEquals(-5, Week3.minOfArray(testArray1));
        assertEquals(-1, Week3.minOfArray(testArray2));
        assertEquals(-5, Week3.minOfArray(testArray3));
        assertEquals(-100, Week3.minOfArray(testArray4));
        assertEquals(-30, Week3.minOfArray(testArray5));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testBMI() {
        assertEquals("Bình thường", Week3.calculateBMI(66, 1.77));
        assertEquals("Bình thường", Week3.calculateBMI(52, 1.65));
        assertEquals("Béo phì", Week3.calculateBMI(74, 1.66));
        assertEquals("Thiếu cân", Week3.calculateBMI(50, 1.65));
        assertEquals("Thiếu cân", Week3.calculateBMI(60, 1.88));
    }
}
