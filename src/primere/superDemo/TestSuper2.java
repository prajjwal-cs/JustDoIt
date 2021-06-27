/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher)
 *   Date: 14-02-2021
 *   Time: 1:46 AM
 *   File: TestSuper2.java
 */

package primere.superDemo;

class Animal {
    Animal() {
        System.out.println("Animal is created");
    }
}
class Dogs extends Animals {
    Dogs() {
        super();
        System.out.println("dog is created");
    }
}
public class TestSuper2 {
    public static void main(String[] args) {
        Dogs d =new Dogs();
    }
}
