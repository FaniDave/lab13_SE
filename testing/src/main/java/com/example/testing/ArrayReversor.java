package com.example.testing;

public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int[][] input) {
        int[] flattenedArray = arrayFlattenerService.flattenArray(input);
        if (flattenedArray == null) {
            return null;
        }
        int length = flattenedArray.length;
        int[] reversedArray = new int[length];
        for (int i = 0; i < length; i++) {
            reversedArray[i] = flattenedArray[length - i - 1];
        }
        return reversedArray;
    }
}