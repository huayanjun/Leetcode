package leetcode;

import java.util.HashMap;

/**
 * @Author :huayanjun
 * @Data: 2019/8/29 8:43
 * leetcode:205
 */
public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.isEmpty())
            return true;
        HashMap<Character,Integer> maps =new HashMap<>();
        HashMap<Character,Integer> mapt =new HashMap<>();
        int index=0;
        for(int i=0;i<s.length();i++){
            char keys=s.charAt(i);
            char keyt=t.charAt(i);
            if(maps.containsKey(keys)==mapt.containsKey(keyt)){
                if(maps.containsKey(keys)){
                    if(maps.get(keys)!=mapt.get(keyt))
                        return false;
                }else {
                    index++;
                    maps.put(keys,index);
                    mapt.put(keyt,index);
                }
            }else {
                return false;
            }
        }
        return true;
    }






}
