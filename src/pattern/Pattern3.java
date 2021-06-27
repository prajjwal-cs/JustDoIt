/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri
    Date: 27-06-2021
    Time: 10:10 PM
    File: Pattern3.java 
*/
package pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of rows: ");
        int row = scanner.nextInt();

        for (int i = 1; i <= row ; i++){
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= row-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}