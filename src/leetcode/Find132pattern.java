package leetcode;

import java.util.HashMap;

/**
 * @Author :huayanjun
 * @Data: 2019/9/8 9:06
 */
public class Find132pattern {
    public boolean find132pattern(int[] nums) {
        if(nums==null||nums.length<3)
            return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=nums[0];
        int min=nums[0];
        for (int i=1;i<nums.length;i++){
            int a= nums[i];
            if(a>max){
                max=a;
            }else if(a>min&&a<max){
                return true;
            }else if(a<min){
                if(max-min>1){
                    if(map.containsKey(min)){
                        int temp =map.get(min);
                        if(temp>max){
                        max=temp;
                        }
                    }
                    map.put(min,max);
                }
                max=a;
                min=a;
            }
            if(!map.isEmpty()) {
                for (int head : map.keySet()) {
                    int tail = map.get(head);
                    if (a > head && a < tail)
                        return true;
                }
            }
        }
        return false;
    }



}
