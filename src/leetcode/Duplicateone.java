package leetcode;

import java.util.HashSet;

/**
 * @Author :huayanjun
 * @Data: 2019/8/28 8:22
 * leetcode:217
 */
public class Duplicateone {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==0)
            return false;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if (!set.add(num))
                return true;
        }
        return false;

    }
}
