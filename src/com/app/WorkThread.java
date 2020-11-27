package com.app;

/**
 * This class implements a thread. A thread is a smallest individual unit of executable prgram.
 * It creates a void thread ( A thread that never returns ). The thread takes the multiplication value and outputs it.
 * @author DevSW
 * 
 */
public class WorkThread extends Thread {

    private int val;

    //Constructor to accept thread name and value.
    public WorkThread(final String name, final int val) {
        super(name);
        this.val = val;
    }

    //This method is an override of {@code java.lang.Thread.run()}. Implements a thread.
    @Override
    public void run() {

        //A loop to display the table
        for (int i = 1; i <= 10; i++) {
            System.out.println((val) + " X " + i + " = " + (val * i));

            //Simple timer which pauses execution for half a second.
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace(); //Outputs the error!
            }
        }
    }
}