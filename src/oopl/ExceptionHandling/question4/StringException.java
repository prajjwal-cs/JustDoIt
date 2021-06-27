/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 28-03-2021
    Time: 09:42
    File: StringExcetion.java 
*/
package oopl.ExceptionHandling.question4;

import javax.xml.stream.events.Characters;

public class StringException {
    // Write a program to print a given string
    // character by character and handle StringIndexOutOfBoundsException.
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        String name = "PrajjwalPachauri";
        try {
            int count = 0;
            char[] character = name.toCharArray();
            while (count >= 0) {
                System.out.print(character[count++] + ", ");
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println();
            System.out.println("Array Indexes went out of Bound!");       }
    }
}