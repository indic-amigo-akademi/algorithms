package com.iaa.algorithms.search;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class BinarySearchTest {
    BinarySearch<Integer> bSearchInt;
    ArrayList<Integer> haystack;

    void setUpIntArr() {
        haystack = new ArrayList<>();
        haystack.add(1);
        haystack.add(5);
        haystack.add(6);
        haystack.add(7);
        haystack.add(8);
        haystack.add(11);
        bSearchInt = new BinarySearch<>(haystack);
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
        assertEquals(1, bSearchInt.binarySearchRecursive(5, 0, haystack.size() - 1));
        assertEquals(4, bSearchInt.binarySearchRecursive(8, 0, haystack.size() - 1));
        assertEquals(-1, bSearchInt.binarySearchRecursive(17, 0, haystack.size() - 1));
        assertEquals(-1, bSearchInt.binarySearchRecursive(-1, 0, haystack.size() - 1));
    }
}
