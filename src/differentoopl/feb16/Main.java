/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher)
 *   Date: 17-02-2021
 *   Time: 4:07 AM
 *   File: Main.java
 */

package differentoopl.feb16;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Employee1");
        System.out.println(emp1.getName());

        // CellPhone
        CellPhone samsung = new CellPhone();
        samsung.ringing();
        samsung.vibrating();
        samsung.callingFriend();
    }
}
