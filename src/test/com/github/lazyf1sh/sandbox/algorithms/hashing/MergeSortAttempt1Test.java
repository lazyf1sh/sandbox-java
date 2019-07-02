package com.github.lazyf1sh.sandbox.algorithms.hashing;

import com.github.lazyf1sh.sandbox.algorithms.MergeSortAttempt1;
import org.junit.Test;
import org.junit.Assert;

public class MergeSortAttempt1Test {

    @Test
    public void dasdsa() {
        int[] arr = new int[]{9, 20, 48, 7, 1, 35, 5, 13};
        int[] result = new MergeSortAttempt1().sort(arr);
        int[] expected = new int[]{1, 5, 7, 9, 13, 20, 35, 48};
        Assert.assertArrayEquals(expected, result);
    }
}
