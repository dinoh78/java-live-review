package week09;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {4,1,6,3};
        //1. By using new array
        int[] numsR = new int[nums.length];
        for (int i = nums.length-1, j = 0; i >= 0; i--, j++) {
            numsR[j] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsR));

        //2. Modify same array. No new array
        for (int i = 0, j = nums.length-1; i < nums.length/2; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        System.out.println("nums = " + Arrays.toString(nums));

        int[] scores = {33, 12, 66, 9, 56};
        System.out.println(Arrays.toString(reverseArr(scores)));

        int[] counts = {44, 66, 123, 986, 111};
        int[] result = reverseArray(counts);
        System.out.println(Arrays.toString(result));
    }

    public static int[] reverseArr(int[] nums) {
        int[] numsR = new int[nums.length];
        for (int i = nums.length-1, j = 0; i >= 0; i--, j++) {
            numsR[j] = nums[i];
        }
        return numsR;
    }

    public static int[] reverseArray(int[] nums) {
        for (int i = 0, j = nums.length-1; i < nums.length/2; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
}