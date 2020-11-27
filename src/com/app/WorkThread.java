package com.app;

public class WorkThread extends Thread {

    private int val;

    public WorkThread(final String name, final int val) {
        super(name);
        this.val = val;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println((val) + " X " + i + " = " + (val * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}