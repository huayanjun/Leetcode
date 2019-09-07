package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author :huayanjun
 * @Data: 2019/8/17 15:47
 * leetcode:49
 */
public class GroupAnagrams {

    /*
    1.自己最开始的思路，分两步，先写一个比较大小的方法；
    2.在进行2层for循环判断装进List里，运行速度慢
    public List<List<String>> groupAnagrams(String[] strs) {`
        for(String str:strs){
            list.add(str);
        }
        List<List<String>> listall = new ArrayList<List<String>>();
        for (int i=0;i<list.size();i++){
            List<String> alist=new ArrayList<String>();
            if(list.get(i).equals("0")){
                continue;
            }
            alist.add((list.get(i)));
            for(int j=i+1;j<list.size();j++){
                if(list.get(j).equals("0")){
                    continue;
                }
                if(isSame(strs[i],strs[j])){
                    alist.add(list.get(j));
                    list.set(j,"0");
                }
            }
            listall.add(alist);
        }
        return listall;

    }

    public boolean isSame(String a,String b){
        char[] charA=a.toCharArray();
        char[] charB=b.toCharArray();
        if(charA.length==charB.length){
            for(int i=0;i<charA.length;i++){
                int x=a.indexOf(charA[i]);
                String s=charA[i]+"";
                if(x>=0){
                    b=b.replaceFirst(s,"");
                }
            }
            return b.equals("");
        }else {
            return false;
        }
    }
    */
    /*
    * 1.将字符串按字母顺序排列后作为key，放入hashmap
    * 2.将所有一key一样的放入key的value里*/
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<String,List<String>>();
        for(int i=0; i<strs.length;i++){
            char [] charList =strs[i].toCharArray();
            Arrays.sort(charList);
            String key =String.valueOf(charList);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }else {
                List<String> temp =new  ArrayList<String>();
                temp.add(strs[i]);
                map.put(key,temp);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }


}
