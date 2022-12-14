package easy;

import java.util.Arrays;

public class TwoSumSolution {
    public static int[] twoSum(int[] nums, int target) {
        int [] n = new int[2];
        for (int a = 0; a < nums.length; a++) {
            for (int j = a + 1; j < nums.length; j++) {
                while ((nums[a] + nums[j]) == target) {
                    n[0] = a;
                    n[1] = j;
                    break;
                }
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int[] intArr = new int[]{1,2,3,4,5,6,7,};
        int tar = 3;
        System.out.println(twoSum(intArr,tar));

    }
}
