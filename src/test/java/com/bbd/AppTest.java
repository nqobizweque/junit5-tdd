package com.bbd;

import org.junit.jupiter.api.*;
import sun.invoke.empty.Empty;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    // Player 1
    @Test
    public void testNumber1(){
        assertEquals(1,RomanConverter.Convert("I"));
    }

    // Player 2
    @Test
    public void testNumber2(){
        assertEquals(2, RomanConverter.Convert("II"));
    }

    @Test
    public void testNumber5(){
        assertEquals(5,RomanConverter.Convert("V"));
    }

    @Test
    public void testTowDifferentNumbers(){
        assertEquals(6, RomanConverter.Convert("VI"));
    }

    @Test
    public void testSmallchar(){
        assertEquals(6,RomanConverter.Convert("vi"));
    }

    // Player 2
    @Test
    public void testX() {
        assertEquals(10, RomanConverter.Convert("x"));
    }

    @Test
    public void testL() {
        assertEquals(50, RomanConverter.Convert("l"));
    }

    // Player 2
    @Test
    public void testC() {
        assertEquals(100, RomanConverter.Convert("C"));
    }

    @Test
    public void testD() {
        assertEquals(500, RomanConverter.Convert("D"));
    }

    @Test
    public void testM() {
        assertEquals(1000, RomanConverter.Convert("M"));
    }

    @Test
    public void testA() {
        Assertions.assertThrows(
                RuntimeException.class, () -> RomanConverter.Convert("A"));
    }


    @Test
    public void testNull() {
        Assertions.assertThrows(
                RuntimeException.class, () -> RomanConverter.Convert(""));
    }

    @Test
    public void testNumber4() {
        assertEquals(4, RomanConverter.Convert("IV"));
    }

    @Test
    public void testNumber40() {
        assertEquals(40, RomanConverter.Convert("XL"));
    }

    @Test
    public void testNumber9() {
        assertEquals(9, RomanConverter.Convert("IX"));
    }

    @Test
    public void testNumber90() {
        assertEquals(90, RomanConverter.Convert("XC"));
    }

    @Test
    public void testNumber400() {
        assertEquals(400, RomanConverter.Convert("CD"));
    }

    @Test
    public void testNumber999() {
        assertEquals(999, RomanConverter.Convert("CMXCIX"));
    }

    @Test
    public void testInvalidRepetition() {
        Assertions.assertThrows(
                RuntimeException.class, () -> RomanConverter.Convert("IIII"));
    }
}
