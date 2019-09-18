package leetcode;

/**
 * @Author :huayanjun
 * @Data: 2019/9/7 10:19
 */
public class IsOneBitCharacter {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;

        if (bits[len - 1] == 1)
            return false;

        int i = 0;
        while (i < len - 2) {
            if (bits[i] == 0) {
                i++;
            } else {
                i += 2;
            }
        }

        if (i == len - 2) {
            if (bits[i] == 1)
                return false;
        }
        return true;
    }
    Class z =int.class;
}
