/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri(cypher)
    Date: 08-03-2021
    Time: 15:46
    File: MyMain.java 
*/
package newstack.array.newmain;


import newstack.array.implementation.AnStackImplementation;

public class MyMain {
    public static void main(String[] args) {
        AnStackImplementation stack = new AnStackImplementation(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.traverse();
        System.out.println(stack.peek());
    }
}