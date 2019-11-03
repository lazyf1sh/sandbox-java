package com.github.lazyf1sh.sandbox.java.patterns.listener.one;

public class LongRunningTask implements Runnable
{

    private OnCompleteListener onCompleteListener;

    public LongRunningTask(OnCompleteListener onCompleteListener)
    {
        this.onCompleteListener = onCompleteListener;
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(5 * 1000); // sleep for 5 seconds and pretend to be working
            onCompleteListener.onComplete();

        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}