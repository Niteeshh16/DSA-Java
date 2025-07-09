// Find missing number in array from 0 to n
public class FindMissingElement{
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 4};

        int n = nums.length; // since range is [0..n], and nums has size n
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;
        System.out.println(missing);
    }
}
