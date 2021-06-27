/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 28-03-2021
    Time: 18:50
    File: Main.java 
*/
package oopl.stringclass.question1;

public class Main {
    // Write a program to concatenate StringBuilder & StringBuffer objects.

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        StringBuffer stringBuffer = new StringBuffer(" World");

        // concat
        String newString = stringBuilder.toString().concat(stringBuffer.toString());
        System.out.println(newString);
    }
}