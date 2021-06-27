/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 30-03-2021
    Time: 18:09
    File: Solution3.java 
*/
package oopl.stringclass.question4;

public class Solution3 {
    // Write a program to check whether two given strings contains same set
    // of characters as well as having same length.

    public static void main(String[] args) {
        String s1 = "amar";
        String s2= "rama";

        if (s1.matches(s1)) {
            System.out.println("Both contains same characters");
        }
        else {
            System.out.println("Not matching characters");
        }
    }
}