package org.example;

class Solution {
    public static int binarySearch(int[] nums, int target) {
        int last = nums.length - 1;
        int first = 0;
        int mid = (last + first) / 2;

        while (first <= last) {
            if (nums[mid] == target) {
                return mid;
            }
            if (target > nums[mid]) {
                first = mid + 1;

            } else {
                last = mid - 1;

            }
            mid = (last + first) / 2;

        }
        return -1;
    }
}
