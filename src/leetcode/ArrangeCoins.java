package leetcode;

/**
 * @Author :huayanjun
 * @Data: 2019/9/11 9:27
 */
public class ArrangeCoins {
    public int arrangeCoins(int n) {
       int k =(int) Math.floor((Math.sqrt(1+8.0*n)-1)/2);
       return k;

    }


}
