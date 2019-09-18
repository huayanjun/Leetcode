package leetcode;

import java.util.*;

/**
 * @Author :huayanjun
 * @Data: 2019/9/5 8:34
 */
public class RelativeSort {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr2) {
            map.put(i, 0);
        }

        List<Integer> list = new ArrayList<>();
        for (int j : arr1) {
            if (map.containsKey(j)){
                map.put(j, map.get(j) + 1);
            }else
                list.add(j);
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });


        List<Integer> reslist= new ArrayList<>();
        for (int a :arr2) {
            for (int i = 1; i <= map.get(a); i++) {
                reslist.add(a);
            }
        }
        reslist.addAll(list);
        int[] res = new int[arr1.length];
        int index=0;
        for(Integer i:reslist){
           res[index++]=i;
        }

        return res;



    }
}
