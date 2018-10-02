package week3;
import week3.Week3.java;
import org.junit.Test;


public class Week3Test {
    Week3 test =new Week3();
    @Test;
        public void testMax1(){
            int i= test.max(7,9);
            assertEquals(9,i);
            int j= test.max(20,8);
            assertEquals(20,i);
            int a=test.max(15,19 );
            assertEquals(19, a);
            int b= test.max(11.2, 6);
            assertEquals(11.2, b);
            int c= test.max(100,9);
            assertEquals(100, c);
        }
        @Test;
        public void testmin(){
            int[] a={4,6,8,5,3,9};
            int i=test.minOfArray(a);
            assertEquals(3,i);

            int[] b= { 1,1};
            int j=test.minOfArray(b);
            assertEquals(1,j);

            int[] c={66,0,-1,8,9};
            int k=test.minOfArray(c);
            assertEquals(-1,k);

            int[] d={100,-11,2,1,-3};
            int h=test.minOfArray(d);
            assertEquals(-11,h);

            int[] e={22, 0, 33.4, 7};
            int l= test.minOfArray(e);
            assertEquals(0,l);
        }
        public void setBMI(){
            assertEquals("Binh Thuong", test.calculateBMI(52,1.52););
            assertEquals("Beo phi",test.calculateBMI(70, 1.65););
            assertEquals("thieu can",test.calculateBMI(45, 1.63););
            assertEquals("Thua can", test.calculateBMI(60, 1.58););
            assertEquals("Binh Thuong",test.calculateBMI(58, 1.59););
        }

    // TODO: Viết 5 testcase cho phương thức max()

    // TODO: Viết 5 testcase cho phương thức minOfArray()

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
}
