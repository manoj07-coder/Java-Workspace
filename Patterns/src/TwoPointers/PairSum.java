package TwoPointers;

public class PairSum {
    public static void main(String[] args) {
        int[] nums = {1,2,4,6,7,9,11,13,14};
        System.out.println(hasPair(nums, 20));
        System.out.println(hasPair(nums,26));
    }

    public static boolean hasPair(int[] nums, int target){

        int left = 0, right = nums.length - 1;

        while(left < right) {
            int sum = nums[left] + nums[right];

            if(sum == target) return true;
            else if (sum < target) left++;
            else right--;
        }
        return false;
    }
}
