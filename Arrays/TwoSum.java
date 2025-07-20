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
    
    static int[] twoPointer(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while (low < high){
            int sum = nums[low] + nums[high];
            if (target== sum){
                return new int[]{low+1, high+1};
            } else if (sum <= target) {
                low++;
            }else {
                high--;
            }
        }
        return new int[2];
    }
    
    
        public static void main(String[] args) {
            int nums[] = {2,7,11,15};
            int target = 18;
        //System.out.println(Arrays.toString(twoSum(nums,target)));
            System.out.println(Arrays.toString(twoPointer(nums,target)));
    }
}
