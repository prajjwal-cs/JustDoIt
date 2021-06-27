/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 28-03-2021
    Time: 19:06
    File: Solution2.java 
*/
package oopl.stringclass.question3;

public class Solution2 {
    // Write a program to display the length and capacity of String, StringBuilder and StringBuffer.

    public static void main(String[] args) {
        String name = "Hello";
        StringBuffer buffer = new StringBuffer("JAVA");
        StringBuilder builder = new StringBuilder("Programming");

        System.out.println("String length = " + name.length());
        System.out.println("StringBuffer length = " + buffer.length());
        System.out.println("StringBuffer Capacity = " + buffer.capacity());
        System.out.println("StringBuilder length = " + builder.length());
        System.out.println("StringBuilder Capacity = " + builder.capacity());
    }
}