/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 27-03-2021
    Time: 23:57
    File: MyMain.java 
*/
package oopl.ExceptionHandling.question1;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) throws MyFirstException {
        Scanner scanner = new Scanner(System.in);
        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();
        int sumOfTwoUserValues = firstValue + secondValue;
        if (sumOfTwoUserValues < 150) {
            throw new MyFirstException("Custom Exception Occurred");
        } else {
            System.out.println("Sum of " + firstValue + " + " +
                    secondValue + " = " + sumOfTwoUserValues);
        }
    }
}