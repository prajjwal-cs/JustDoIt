/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 28-03-2021
    Time: 18:58
    File: Solution2.java 
*/
package oopl.stringclass.question2;

public class Solution2 {
    // Write a program to get a substring of a StringBuffer.

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("My Programming is now good");

        String result = stringBuffer.substring(17);
        System.out.println(result);
    }
}