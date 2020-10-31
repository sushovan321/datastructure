package com.sadprogramming.ds.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindNumberWithEvenDigitsTest {

    @Test
    void findNumbers() {

            assertEquals(2, FindNumberWithEvenDigits.findNumbers(new int[]{12, 4, 3, 64, 7}));
        assertEquals(2, FindNumberWithEvenDigits.findNumbers(new int[]{12, 345, 2, 6, 7896}));
        assertEquals(1, FindNumberWithEvenDigits.findNumbers(new int[]{555,901,482,1771}));
        }
    }
