package com.github.lazyf1sh.sandbox.java.playground.droptoframeplayground;

import org.junit.Test;

/**
 * @author Ivan Kopylov
 */
public class DropToFrame
{
    @Test
    public void main()
    {
        System.out.println("Drop frame allows to replay function.");
        new Counter().count();
    }
}
