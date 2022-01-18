/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 17-01-2022
Time: 14:53
File: BinSearch.java */

public class BinSearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
}