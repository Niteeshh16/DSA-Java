package Arrays;
import java.util.*;

public class TwoSum {
    static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int pair = target - nums[i];
            if (map.containsKey(pair)){
                return new int[]{map.get(pair),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
            int nums[] = {1,6,2,10,3};
            int target = 7;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
