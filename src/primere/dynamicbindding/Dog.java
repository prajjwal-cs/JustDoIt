/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher)
 *   Date: 14-02-2021
 *   Time: 3:43 AM
 *   File: Dog.java
 */

package primere.dynamicbindding;

public class Dog extends Animal{
    void eat() {
        System.out.println("Dog is eating");
    }
    public static void main(String[] args) {
        Animal d1 = new Dog();
        d1.eat();
    }
}
