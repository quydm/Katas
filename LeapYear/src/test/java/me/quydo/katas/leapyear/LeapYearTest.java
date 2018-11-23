package me.quydo.katas.leapyear;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {

    @Test
    public void test1() {
        boolean expected = true;
        boolean actual = LeapYear.isLeapYear(1996);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        boolean expected = false;
        boolean actual = LeapYear.isLeapYear(2001);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        boolean expected = true;
        boolean actual = LeapYear.isLeapYear(2000);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        boolean expected = false;
        boolean actual = LeapYear.isLeapYear(1900);
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        boolean expected = false;
        boolean actual = LeapYear.isLeapYear(1700);
        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        boolean expected = false;
        boolean actual = LeapYear.isLeapYear(1800);
        assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        boolean expected = false;
        boolean actual = LeapYear.isLeapYear(2100);
        assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        boolean expected = true;
        boolean actual = LeapYear.isLeapYear(2008);
        assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        boolean expected = true;
        boolean actual = LeapYear.isLeapYear(2012);
        assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        boolean expected = true;
        boolean actual = LeapYear.isLeapYear(2016);
        assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        boolean expected = false;
        boolean actual = LeapYear.isLeapYear(2017);
        assertEquals(expected, actual);
    }

}
