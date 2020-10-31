package com.sadprogramming.ds.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SortedSquareTest {

    @Test
    void sortedSquare() {

        assertArrayEquals(new int[]{0, 1, 9, 16, 81,100},
            SortedSquare.sortedSquare(new int[]{-4, -1, 0, 3, 9, 10}));

        assertArrayEquals(new int[]{4,9,9,49,121},
            SortedSquare.sortedSquare(new int[]{-7,-3,2,3,11}));

        assertArrayEquals(new int[]{4,9,121,324},
            SortedSquare.sortedSquare(new int[]{2,3,11,18}));

        assertArrayEquals(new int[]{0,4},
            SortedSquare.sortedSquare(new int[]{-2,0}));

        assertArrayEquals(new int[]{0},
            SortedSquare.sortedSquare(new int[]{0}));

        assertArrayEquals(new int[]{4},
            SortedSquare.sortedSquare(new int[]{2}));

        assertArrayEquals(new int[]{4},
            SortedSquare.sortedSquare(new int[]{-2}));


    }

}