
package week3;
import org.junit.Test;
import static org.junit.Assert.*;

public class Week3Test(){
    @Test;
    public void testMax(){
        assertEquals(5,Week3.max(5,3));
        assertEquals(30,Week3.max(7,30));
        assertEquals(-3,Week3.max(-3,-10));
        assertEquals(6,Week3.max(-100,6));
        assertEquals(1,Week3.max(1,0));
        }
    @Test;
    public void testminofArray(){
        int[]Array1={1,7,8,10,-5,4};
        int[]Array2={-2,34,53,65,6,7,345,566};
        int[]Array3={0,33,55,33,-2,456,-1};
        int[]Array4={17,3,8,12,44,6,765,0,-34};
        int[]Array5={353,-3,39,-2,-19};
        assertEquals(-5,Week3.minofArray(Array1));
        assertEquals(-2,Week3.minofArray(Array2));
        assertEquals(-2,Week3.minofArray(Array3));
        assertEquals(-34,Week3.minofArray(Array4));
        assertEquals(-19,Week3.minofArray(Array5));

    }

    @Test;
    public void testBMI(){
        assertEquals("Binh thuong",Week3.calculateBMI(66,1.77));
        assertEquals("Binh thuong",Week3.calculateBMI(52,1.65));
        assertEquals("Beo phi",Week3.calculateBMI(74,1.66));
        assertEquals("Thieu can",Week3.calculateBMI(50,1.65));
        assertEquals("Thua can",Week3.calculateBMI(71,1.68));
        }
}






