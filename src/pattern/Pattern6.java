/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri
    Date: 27-06-2021
    Time: 10:52 PM
    File: Pattern6.java 
*/
package pattern;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "  ");
                num++;
            }
            System.out.println();
        }
    }
}