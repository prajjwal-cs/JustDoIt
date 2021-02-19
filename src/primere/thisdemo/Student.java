/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher)
 *   Date: 14-02-2021
 *   Time: 12:37 AM
 *   File: Student.java
 */

package primere.thisdemo;

public class Student {
    int rollNo;
    String name;
    float fee;
    Student(int rollNo, String name, float fee){
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }
    void display() {
        System.out.println(rollNo + " " + name + " " + fee);
    }
}

class Test1 {
    public static void main(String[] args) {
        Student student1 = new Student(111, "bean", 23f);
        Student student2 = new Student(112, "myao", 783246f);

        student1.display();
        student2.display();
    }
}
