package com.example.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ArrayReversorTest {

    @Mock
    private ArrayFlattenerService arrayFlattenerService;

    private ArrayReversor arrayReversor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        arrayReversor = new ArrayReversor(arrayFlattenerService);
    }

    @Test
    public void testReverseArray() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] flattenedArray = {1, 3, 0, 4, 5, 9};
        int[] expectedOutput = {9, 5, 4, 0, 3, 1};

        when(arrayFlattenerService.flattenArray(input)).thenReturn(flattenedArray);

        assertArrayEquals(expectedOutput, arrayReversor.reverseArray(input));
        verify(arrayFlattenerService).flattenArray(input);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        when(arrayFlattenerService.flattenArray(null)).thenReturn(null);

        assertNull(arrayReversor.reverseArray(null));
        verify(arrayFlattenerService).flattenArray(null);
    }
}