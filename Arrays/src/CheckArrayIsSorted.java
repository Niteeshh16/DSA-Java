public class CheckArrayIsSorted {
    static boolean check(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums ={2,4,1};
        System.out.println(check(nums));
    }
}
