package com.app;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This is a class which outputs multiplication table of any number.
 * 
 * @author DevSW
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("This is a threaded mutiplier");

        //Creating a Scanner object insie a try-catch to catch errors!
        try(Scanner SR = new Scanner(System.in)){

            System.out.println("Enter an integer value");
            int a = SR.nextInt();

            //Executing a thread which outputs the multiplication tables!
            WorkThread thd = new WorkThread("Thread", a);
            thd.start();
            
        }catch (InputMismatchException ime){
            System.out.println("Error! Invalid input");
        }
        
    }
}