import java.util.Arrays;

public class Nums {
    public static void main(String[] args) {
        int nums[]= {3,3};
        int target=6;
        int res[] = twoSum(nums, target);
        System.out.println(Arrays.toString(res));


    }


    public static  int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int k = nums.length-1; k >0; k--) {

                if ((nums[i] + nums[k]) == target) {
                    result[0] = i;
                    result[1] = k;
                    return result;
                }
            }
        }
        return result;
    }
}
