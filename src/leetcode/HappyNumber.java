package leetcode;

import java.util.HashSet;

/**
 * @Author :huayanjun
 * @Data: 2019/8/29 15:09
 * leetcode 202;
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        Integer m=n;
        HashSet<Integer> set = new HashSet<>();
        while (m!=1){
            if(!set.add(m)) return false;
            char[] nums=m.toString().toCharArray();
            m=0;
            for(int i=0;i<nums.length;i++){
                int num=Integer.valueOf(nums[i]+"");
                int s=num*num;
                m+=s;
            }
        }
        return true;

    }

}
