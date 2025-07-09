import java.util.Arrays;

class RemoveDuplicate{
    static int[] remove(int[] nums){
        int n= nums.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]){
                temp[j++] = nums[i];
            }
        }
        temp[j++] = nums[n-1];

        return Arrays.copyOf(temp,j);
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,4,5};
        int result[] = remove(nums);
        for (int num :result){
            System.out.print(num + " ");
        }
    }
}