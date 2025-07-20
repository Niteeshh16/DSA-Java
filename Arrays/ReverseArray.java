package Arrays;

import java.util.Arrays;

public class ReverseArray {
    static int[] reverse(int[] nums){
        int start =0;
        int end = nums.length-1;
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums ={1,3,2,4,5,6};
        System.out.println(Arrays.toString(reverse(nums)));
    }
}
