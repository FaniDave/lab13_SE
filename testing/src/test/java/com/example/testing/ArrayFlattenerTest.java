package com.example.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ArrayFlattenerTest {

    @Test
    public void testFlattenArray() {
        ArrayFlattener arrayFlattener = new ArrayFlattener();
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {1, 3, 0, 4, 5, 9};
        assertArrayEquals(expectedOutput, arrayFlattener.flattenArray(input));
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        ArrayFlattener arrayFlattener = new ArrayFlattener();
        assertNull(arrayFlattener.flattenArray(null));
    }
}