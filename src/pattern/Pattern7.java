/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri
    Date: 27-06-2021
    Time: 10:56 PM
    File: Pattern7.java 
*/
package pattern;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = scanner.nextInt();
        int rows = 2*n-1;

        for (int i = 1; i <= rows; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j = 1; j <= rows-i+1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}