package com.github.lazyf1sh.sandbox.java.mechanics.oop.initblock.staticinitializerinnestedclass.example2;

public class Child extends Parent
{
    static String CHILD_ID;

    static
    {
        System.out.println("Child static initializer");
    }
}
