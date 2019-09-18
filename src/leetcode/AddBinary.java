package leetcode;

/**
 * @Author :huayanjun
 * @Data: 2019/9/10 8:32
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int length = Math.max(a.length(), b.length());
        StringBuilder sba = new StringBuilder(a);
        sba.reverse();
        StringBuilder sbb = new StringBuilder(b);
        sbb.reverse();
        String res = "";
        int w = 0;
        for (int i = 0; i < length; i++) {
            int x = i > a.length() - 1 ? 0 : Integer.parseInt(sba.charAt(i) + "");
            int y = i > b.length() - 1 ? 0 : Integer.parseInt(sbb.charAt(i) + "");
            int temp = x + y + w;
            if (temp >= 2) {
                temp = temp - 2;
                res = temp + res;
                w = 1;
            } else {
                res = temp + res;
                w = 0;
            }
        }
        if (w == 1) {
            res = "1" + res;
        }
        return res;

    }
}
