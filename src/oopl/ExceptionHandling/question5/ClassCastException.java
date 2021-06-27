/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 28-03-2021
    Time: 10:03
    File: ClassCastException.java 
*/
package oopl.ExceptionHandling.question5;

public class ClassCastException {
    // Write a program to handle ClassCastException, by doing explicit casting of Object to Integer.
    public static void main(String[] args) {
        Object object = 3.0;
        System.out.println(Integer.valueOf((String) object));
    }
}