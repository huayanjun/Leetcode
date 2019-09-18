package leetcode;

import java.util.Arrays;

/**
 * @Author :huayanjun
 * @Data: 2019/8/30 8:29
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int max=nums.length;
        if(max==1||nums[0]!=nums[1])
            return nums[0];
        if (nums[max-1] != nums[max-2])
            return nums[max-1];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1])
                return nums[i];
        }
        return 0;
    }
}
