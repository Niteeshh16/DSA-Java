/*1. Start
2. Initialize two variables:
      largest = -∞
      secondLargest = -∞
3. Loop through each element in the array:
      a. If current element > largest:
             secondLargest = largest
             largest = current element
      b. Else if current element > secondLargest and current element != largest:
             secondLargest = current element
4. After the loop ends, secondLargest contains the second largest element.
5. End
*/

package Arrays;
public class SecondLargest {
    static int secondLargest(int[] nums){
        int largest = 0;
        int secondlargest = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > largest){
                secondlargest = largest;
                largest = nums[i];
            } else if (nums[i]> secondlargest && nums[i] != largest) {
                secondlargest = nums[i];
                
            }


        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int[] nums = {23,32,12,34,45};
        System.out.println(secondLargest(nums));
    }
}
