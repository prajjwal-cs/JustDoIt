/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 13-01-2022
Time: 15:16
File: FindSecondMaximum.java */
package gla;

public class FindSecondMaximum {
    public static int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

}