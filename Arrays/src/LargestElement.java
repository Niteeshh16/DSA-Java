/*
1. Start
2. Initialize `max` with the first element of the array.
3. Loop through the array from the second element to the last:
    a. If the current element > `max`, then set `max = current element`.
4. After the loop ends, `max` contains the largest element.
5. End
*/



public class LargestElement {
    static int largest(int[] nums){
        int max = nums[0];
        for (int i=0; i<nums.length; i++){
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] > max){
                    max = nums[j];
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[]  nums={1,2,323,34,2334,3};
        System.out.println(largest(nums));
    }
}
