package week3;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static week3.Week3.*;

public class Week3Test {


    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        assertEquals(1,max(1,0));
        assertEquals(5,max(4,5));
        assertEquals(10,max(1,10));
        assertEquals(-1,max(-1,-10));
        assertEquals(60,max(60,50));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int[] a={1,2,3,5,4};
        int[] a1 ={9,8,7,6,3,5,4,2,1,10};
        int[] a2 ={-1,-1,1,20,10};
        int[] a3 ={6,7,8,5,4,-2,5,-1};
        int[] a4 ={11,12,13,14,19,10,-1,-2,9,-5,-9,3};
        //int[] a5 ={100,200,300,111,11,2,-3,-4,0};
        assertEquals(1,minOfArray(a));
        assertEquals(1,minOfArray(a1));
        assertEquals(-1,minOfArray(a2));
        assertEquals(-2,minOfArray(a3));
        assertEquals(-9,minOfArray(a4));
    }
    @Test
    public void testCalculateBMI(){
        //assertEquals("Thieu can",calculateBMI(50,1.67));
        assertEquals("Beo phi",calculateBMI(60,1.51));
        assertEquals("Binh thuong",calculateBMI(50,1.49));
        assertEquals("Thieu can",calculateBMI(40,1.5));
        assertEquals("Thua can",calculateBMI(70,1.7));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
}