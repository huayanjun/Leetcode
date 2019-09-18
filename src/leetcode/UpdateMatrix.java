package leetcode;

import java.util.*;

/**
 * @Author :huayanjun
 * @Data: 2019/9/6 9:02
 */
public class UpdateMatrix {
    public int[][] update(int[][] matrix) {
        int length = matrix.length;
        int[][] neighbors = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> queue = new LinkedList<>();

        //将为零的节点加入序列
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    queue.add(new int[]{i, j});
                } else {
                    matrix[i][j] = -1;
                }
            }
        }

        //遍历节点
        while (!queue.isEmpty()) {
            int[] arr = ((LinkedList<int[]>) queue).pop();
            int a = arr[0];
            int b = arr[1];
            for (int[] neighbor : neighbors) {
                int x = neighbor[0];
                int y = neighbor[1];
                if (a + x >= 0 && b + y >= 0 && a + x < length && b + y < matrix[0].length) {
                    if (matrix[a + x][b + y] == -1) {
                        matrix[a + x][b + y] = matrix[a][b] + 1;
                        queue.add(new int[]{a + x, b + y});
                    }
                } else {
                    continue;
                }
            }
        }

        return matrix;
    }


}
