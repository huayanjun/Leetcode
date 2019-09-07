package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author :huayanjun
 * @Data: 2019/8/25 16:57
 * leetcode:347
 */
public class TopKFrequent {
    public List<Integer> topKFrequnet(int[] nums,int k){

        //获得map，key为数，value为频次;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        //将频次和索引挂钩
        List<Integer> [] list = new List[nums.length+1];

        for (int key:map.keySet()){
            int i=map.get(key);
            if(list[i]==null)
                list[i]= new ArrayList<>();
            list[i].add(key);
        }

        //反向取值
        List<Integer> res = new ArrayList<>();
        for(int i=list.length-1;i>=0&&res.size()<k;i--){
            if(list[i]==null)
                continue;
            res.addAll(list[i]);
        }

        return res;



    }
}
