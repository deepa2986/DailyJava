package datastructures.arrays;

import java.util.Arrays;

public class MaxProductOfTwoNum {

    public static void main(String[] args) {
        int[] numbers = {7,17,13,19,5};
        int maxProductOfTwo = maxProductOfTwo(numbers);
        System.out.println(maxProductOfTwo);

        int productOfTwoBySorting = maxProductOfTwoBySorting(numbers);
        System.out.println(productOfTwoBySorting);

        int productOfTwoNumOptimised = maxProductOfTwoNumOptimised(numbers);
        System.out.println(productOfTwoNumOptimised);
    }

    static int maxProductOfTwo(int[] nums){
        int length = nums.length;
        int max = Integer.MIN_VALUE;
        if(length < 2){
            return max;
        }

        for(int i = 0; i < length; i++){
            for(int j = i + 1; j < length; j++){
                if(nums[i] * nums[j] > max){
                    max = nums[i] * nums[j];
                }
            }
        }
        return max;
    }

    static int maxProductOfTwoBySorting(int[] nums){
        int length = nums.length;
        int max = Integer.MIN_VALUE;
        if(length < 2){
            return max;
        }
        Arrays.sort(nums);
        int maxProduct = nums[length - 2] * nums[length - 1];
        int minProduct = nums[0] * nums[1];

        if(maxProduct > minProduct){
            return maxProduct;
        }else return minProduct;
    }

    static int maxProductOfTwoNumOptimised(int[] nums){
        int max1 = nums[0];
        int max2 = Integer.MIN_VALUE;
        int min1 = nums[0];
        int min2 = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
            }else if(nums[i] > max2){
                max2 = nums[i];
            }
                if(nums[i] < min1){
                min2 = min1;
                min1 = nums[i];
            }else if(nums[i] < min2){
                    min2 = nums[i];
                }
        }
        int maxProduct = max1 * max2;
        int minProduct = min1 * min2;

        if(maxProduct > minProduct){
            return maxProduct;
        }else return minProduct;
    }
}
