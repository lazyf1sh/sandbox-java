package com.github.lazyf1sh.sandbox.java.bit64;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Kopylov
 */
public class SixtyFourBitJavaMaximumSize
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        for (long i = 0; i < 1_000_000_000; i++)
        {
            list.add(String.valueOf(i));
        }
        int i = 0;
    }
}
