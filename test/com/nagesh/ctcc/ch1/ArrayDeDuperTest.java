package com.nagesh.ctcc.ch1;

import org.junit.Test;

import static com.nagesh.ctcc.ch1.ArrayDeDuper.deDupeWithArrayList;
import static com.nagesh.ctcc.ch1.ArrayDeDuper.isArrayUnique;
import static org.junit.Assert.*;


/**
 * Created by predixtester on 4/26/17.
 */
public class ArrayDeDuperTest {
    @Test
    public void testEmpyArray() {
        int[] input = new int[]{};
        int[] result = deDupeWithArrayList(input);
        assertArrayEquals(result, input);

        assertFalse(isArrayUnique(input));
    }

    @Test
    public void testSingleElementArray() {
        int[] input = {1};
        assertTrue(isArrayUnique(input));
    }

    @Test
    public void testNonEmptyNoDuplicateArray() {
        int[] input = {1, 2, 4, 3};
        int[] result = deDupeWithArrayList(input);
        assertArrayEquals(result, input);

        assertTrue(isArrayUnique(input));
    }

    @Test
    public void testNonEmptyDuplicateArray() {
        int[] input = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] result = deDupeWithArrayList(input);
        assertArrayEquals(expectedResult, result);

        assertFalse(isArrayUnique(input));

    }

}
