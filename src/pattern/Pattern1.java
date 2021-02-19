/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher)
 *   Date: 14-02-2021
 *   Time: 8:49 PM
 *   File: Pattern1.java
 */

package pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            for (int i1 = 0; i1 < col; i1++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
