/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri
    Date: 27-06-2021
    Time: 10:04 PM
    File: Pattern2.java 
*/
package pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of rows: ");
        int row = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}