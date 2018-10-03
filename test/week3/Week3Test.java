
package week3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax1() {
        assertEquals(5, Week3.max(5, 3));
        assertEquals(30, Week3.max(7, 30));
        assertEquals(-3, Week3.max(-3, -10));
        assertEquals(6, Week3.max(-100, 6));
        assertEquals(1, Week3.max(1, 0));

    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testminOfArray() {
        int[] Array1 = {1, 7, 8, 10, -5, 4};
        int[] Array2 = {-1, 34, 53, 65, 2, 5424, 35, 235, 46};
        int[] Array3 = {2, 8, 23, 423, 4, -5};
        int[] Array4 = {2, 54, 23, 4, -100, 523, 45, 2, 24, 32, 4, 234, 4, 1};
        int[] Array5 = {2, 3, 3, 4234, 2345, 2345, 24, 5234, 5432, 5, 4};
        assertEquals(-5, Week3.minOfArray(Array1));
        assertEquals(-1, Week3.minOfArray(Array2));
        assertEquals(-5, Week3.minOfArray(Array3));
        assertEquals(-100, Week3.minOfArray(Array4));
        assertEquals(2, Week3.minOfArray(Array5));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testBMI() {
        assertEquals("Binh Thuong", Week3.calculateBMI(66, 1.77));
        assertEquals("Binh Thuong", Week3.calculateBMI(52, 1.65));
        assertEquals("Beo phi", Week3.calculateBMI(74, 1.66));
        assertEquals("thieu can", Week3.calculateBMI(50, 1.65));
        assertEquals("Thua can", Week3.calculateBMI(71, 1.68));
    }
}
