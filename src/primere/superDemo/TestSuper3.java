/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher)
 *   Date: 14-02-2021
 *   Time: 1:54 AM
 *   File: TestSuper3.java
 */

package primere.superDemo;

class Person {
    int id;
    String name;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Emp extends Person {
    float salary;
    Emp(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }
    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
public class TestSuper3 {
    public static void main(String[] args) {
        Emp em1 = new Emp(1, "Arun", 38000f);
        em1.display();
    }
}
