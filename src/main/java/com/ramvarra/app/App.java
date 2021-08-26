package com.ramvarra.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Num Args: " + args.length);
        for (String s: args) {
            System.out.println("Arg = " + s);
        }
        System.out.println("Hello World!")
    }
}
