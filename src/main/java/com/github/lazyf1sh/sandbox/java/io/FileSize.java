package com.github.lazyf1sh.sandbox.java.io;

import java.io.File;

public class FileSize
{
    public static void main(String[] args)
    {
        File f = new File("C:/Windows/System32/drivers/etc/hosts");
        f.length();
    }
}
