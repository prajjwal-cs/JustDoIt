/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri
    Date: 27-06-2021
    Time: 09:55 PM
    File: Pattern1.java 
*/
package pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter Number of columns: ");
        int col = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
