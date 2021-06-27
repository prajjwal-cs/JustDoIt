/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 28-03-2021
    Time: 00:05
    File: ArrayException.java 
*/
package oopl.ExceptionHandling.question2;

public class ArrayException {
    // Write a program to demonstrate exception handling for ArrayIndexOutOfBoundsException,
    // using command line arguments.
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command line argument given!");
        }
        else {
            int sizeOfArray = Integer.parseInt(args[0]);
            int[] integerArray = new int[sizeOfArray];
            integerArray[sizeOfArray + 1] = 4;
        }
    }
}