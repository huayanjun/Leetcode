package leetcode;

import java.util.HashMap;

/**
 * @Author :huayanjun
 * @Data: 2019/8/27 9:25
 *leetcode:290
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        if(pattern.length()==0||str.length()==0){
            return false;
        }
        char [] patternA =pattern.toCharArray();
        String [] strA =str.split(" ");
        if(patternA.length!=strA.length){
            return false;
        }

        return patterns(patternA).equals(patterns(strA));


    }

    public String patterns(String [] arr){
        HashMap<String,Integer> map =new HashMap<>();
        map.put(arr[0],1);
        int index=1;
        String s="1";
        for(int i=1;i<arr.length;i++){
            String key =arr[i];
            if(map.containsKey(key)){
                s+=map.get(key);
            }else {
                index++;
                map.put(key,index);
                s+=index;
            }
        }
        return s;
    }

    public String patterns(char [] arr){
        HashMap<Character,Integer> map =new HashMap<>();
        map.put(arr[0],1);
        int index=1;
        String s="1";
        for(int i=1;i<arr.length;i++){
            char key =arr[i];
            if(map.containsKey(key)){
                s+=map.get(key);
            }else {
                index++;
                map.put(key,index);
                s+=index;
            }
        }
        return s;
    }

}
