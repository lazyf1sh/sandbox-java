package com.github.lazyf1sh.sandbox.java.exercises.codingbat;

import com.github.lazyf1sh.sandbox.java.exercises.solutions.everyNth;
import org.junit.Assert;
import org.junit.Test;

/**
 * Source: https://codingbat.com/prob/p196441
 */
public class everyNthTest
{

    @Test
    public void everyNth()
    {
        String s = everyNth.everyNth("Miracle", 2);

        Assert.assertEquals("Mrce", s);
    }
}