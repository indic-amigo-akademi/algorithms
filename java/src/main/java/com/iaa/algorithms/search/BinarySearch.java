package com.iaa.algorithms.search;

import java.lang.System.Logger;
import java.util.ArrayList;

public class BinarySearch<T extends Comparable<T>> {
    private ArrayList<T> arr;

    public BinarySearch(ArrayList<T> arr) {
        this.arr = arr;
    }

    public int binarySearchIterative(T target) {
        int lo = 0, mid, hi = arr.size() - 1;

        while (hi >= lo) {
            mid = (hi + lo) / 2;
            if (target.compareTo(arr.get(mid)) == 0) {
                return mid;
            } else if (target.compareTo(arr.get(mid)) == 1) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(T target, int lo, int hi) {
        if (hi < lo)
            return -1;

        int mid = (hi + lo) / 2;
        
        if (target.compareTo(arr.get(mid)) == 1) {
            return binarySearchRecursive(target, mid + 1, hi);
        } else if (target.compareTo(arr.get(mid)) == -1) {
            return binarySearchRecursive(target, lo, mid - 1);
        }

        return mid;
    }
}
