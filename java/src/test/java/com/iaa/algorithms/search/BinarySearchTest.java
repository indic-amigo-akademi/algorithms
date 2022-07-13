package com.iaa.algorithms.search;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class BinarySearchTest {
    BinarySearch<Integer> bSearchInt;
    ArrayList<Integer> haystackInt;
    BinarySearch<Double> bSearchDouble;
    ArrayList<Double> haystackDouble;

    void setUpIntArr() {
        haystackInt = new ArrayList<>();
        haystackInt.add(1);
        haystackInt.add(5);
        haystackInt.add(6);
        haystackInt.add(7);
        haystackInt.add(8);
        haystackInt.add(11);
        bSearchInt = new BinarySearch<>(haystackInt);
    }

    void setUpDoubleArr() {
        haystackDouble = new ArrayList<>();
        haystackDouble.add(3.7);
        haystackDouble.add(5.6);
        haystackDouble.add(9.4);
        haystackDouble.add(10.2);
        haystackDouble.add(17.5);
        haystackDouble.add(21.3);
        bSearchDouble = new BinarySearch<>(haystackDouble);

    }

    @Test
    public void testIterative1() {
        setUpIntArr();
        assertEquals(1, bSearchInt.binarySearchIterative(5));
        assertEquals(4, bSearchInt.binarySearchIterative(8));
        assertEquals(-1, bSearchInt.binarySearchIterative(17));
        assertEquals(-1, bSearchInt.binarySearchIterative(-1));
    }

    @Test
    public void testRecursive1() {
        setUpIntArr();
        assertEquals(1, bSearchInt.binarySearchRecursive(5, 0, haystackInt.size() - 1));
        assertEquals(4, bSearchInt.binarySearchRecursive(8, 0, haystackInt.size() - 1));
        assertEquals(-1, bSearchInt.binarySearchRecursive(17, 0, haystackInt.size() - 1));
        assertEquals(-1, bSearchInt.binarySearchRecursive(-1, 0, haystackInt.size() - 1));
    }

    @Test
    public void testIterative2() {
        setUpDoubleArr();
        assertEquals(4, bSearchDouble.binarySearchIterative(17.5));
        assertEquals(2, bSearchDouble.binarySearchIterative(9.4));
        assertEquals(-1, bSearchDouble.binarySearchIterative(42.5));
        assertEquals(-1, bSearchDouble.binarySearchIterative(-1.0));
    }

    @Test
    public void testRecursive2() {
        setUpDoubleArr();
        assertEquals(4, bSearchDouble.binarySearchRecursive(17.5, 0, haystackDouble.size() - 1));
        assertEquals(2, bSearchDouble.binarySearchRecursive(9.4, 0, haystackDouble.size() - 1));
        assertEquals(-1, bSearchDouble.binarySearchRecursive(42.5, 0, haystackDouble.size() - 1));
        assertEquals(-1, bSearchDouble.binarySearchRecursive(-1.0, 0, haystackDouble.size() - 1));
    }
}
