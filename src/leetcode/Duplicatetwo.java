package leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Author :huayanjun
 * @Data: 2019/8/28 8:35
 * leetcode:219
 */
public class Duplicatetwo {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length==0)
            return false;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=i+k&&j<nums.length;j++){
                if(nums[i]==nums[j])
                    return true;
            }
        }

        return false;
    }
}
