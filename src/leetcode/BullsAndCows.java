package leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @Author :huayanjun
 * @Data: 2019/8/26 10:09
 * leetcode:299
 */
public class BullsAndCows {
    public String getHints(String secret,String guess){
        int a = 0;
        int b = 0;
        StringBuilder sb = new StringBuilder(secret);
        StringBuilder gb = new StringBuilder(guess);
        for(int i=0;i<guess.length();i++){
            if(sb.charAt(i)==guess.charAt(i)){
                a++;
                sb.setCharAt(i,'x');
                gb.setCharAt(i,'x');

            }
        }
        for(int i=0;i<guess.length();i++){
            if(gb.charAt(i)=='x')
                continue;;
            String s=guess.charAt(i)+"";
            int temp = sb.indexOf(s);
            if(temp>=0){
                b++;
                sb.setCharAt(temp,'x');
            }
        }
        String res =a+"A"+b+"B";
        return res;

    }
}
