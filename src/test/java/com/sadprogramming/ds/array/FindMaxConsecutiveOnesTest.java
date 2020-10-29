package com.sadprogramming.ds.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaxConsecutiveOnesTest {

    @Test
    void findWhenNumberNotPresent() {

        assertEquals(0,FindMaxConsecutiveOnes.find(new int[]{4,2,5,6},1));
    }

    @Test
    void findWhenNumberPresentOnlyOnce() {

        assertEquals(1,FindMaxConsecutiveOnes.find(new int[]{4,2,5,6},2));
    }


    @Test
    void findWhenNumberPresentMultipleTimes() {

        assertEquals(2,FindMaxConsecutiveOnes.find(new int[]{4,2,2,6},2));
    }

    @Test
    void findWhenNumberPresentMultipleTimesAtDifferentIndex() {

        assertEquals(2,FindMaxConsecutiveOnes.find(new int[]{4,2,2,6,2,2},2));
    }

    @Test
    void findWhenNumbersPresentMultipleTimesAtDifferentIndex() {

        assertEquals(3,FindMaxConsecutiveOnes.find(new int[]{4,2,2,6,2,2,2},2));
    }
}