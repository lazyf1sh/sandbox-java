package com.github.lazyf1sh.sandbox.patterns.listener.one;

import org.junit.Test;

public class ListenerDemo
{
    @Test
    public void run()
    {

        MyLongRunningTask myLongRunningTask = new MyLongRunningTask(new OnCompleteListener()
        {
            @Override
            public void onComplete()
            {
                System.out.println("Yeah, the long running task has been completed!");
            }
        });

        System.out.println("Starting the long running task.");
        myLongRunningTask.run();
    }
}