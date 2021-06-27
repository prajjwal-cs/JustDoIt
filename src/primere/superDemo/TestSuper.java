/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher)
 *   Date: 14-02-2021
 *   Time: 1:26 AM
 *   File: TestSuper.java
 */

package primere.superDemo;

class Animals {
    String color = "White";
}
class Dog extends Animals{
    String color = "Black";
    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class TestSuper {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
