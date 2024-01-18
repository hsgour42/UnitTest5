package com.example.unittest5.Service;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalculatorTest {

    @BeforeAll
    public static void init(){
        System.out.println("Run before all");
    }

    @Test
    @Disabled
    public void sumTwoNumber(){
        System.out.println("Run inside sumTwoNumber");
        int result = Calculator.sumTwoNumber(10 , 20);
        int expected = 30;
        Assertions.assertEquals(expected , result , "Result not matched");
    }

    @Test
    @Timeout(unit = TimeUnit.SECONDS , value = 3000)
    @DisplayName("Sum All Number")
    public void sumAllNumbers() throws InterruptedException {
        Thread.sleep(3000);
        int result = Calculator.sumNumbers(10,20,30,40);
        int expected = 100;

        Assertions.assertEquals(expected,result);
    }

    @Test
    @DisplayName("Check two arrays are equal")
    public void checkArrayEqualTest(){
        int[] expected = new int[]{10,20,30,40};
        int[] result = new int[]{10,20,30,40};
        Assertions.assertArrayEquals(expected , result , "Arrays are not equal");
    }

    @Test
    @DisplayName("Check two object are equal")
    public void checkObjectEqualTest(){
        String expected = new String("Rahul");
        // String result = new String("Rahul");
        String result = expected;
        Assertions.assertSame(expected , result , "Object are not equal");
    }



    @Test
    @DisplayName("Check null object are equal")
    public void checkObjectNullTest(){
        String result = null;
        Assertions.assertNull(result  , "Arrays are not equal");
    }

    @Test
    @DisplayName("Check true boolean value")
    public void checkBooleanTrueTest(){
        boolean result = true;
        Assertions.assertTrue( result , "Boolean ::  False");
    }

    @Test
    @DisplayName("Check Array order are same")
    public void checkArrayOrderTest(){
        List<Integer> expected = Arrays.asList(10,20,30,40);
        List<Integer> result = Arrays.asList(10,20,30,40);
        Assertions.assertIterableEquals( expected , result );
    }

    @Test
    @DisplayName("Check Exception")
    public void checkExceptionTest(){

        Assertions.assertThrows( RuntimeException.class , () -> {
            //throw  new Exception();
            throw  new RuntimeException();
        } );
    }

    @AfterAll
    public static void afterAllTest(){
        System.out.println("After all test case");
    }

}
