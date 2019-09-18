package algorithms;

/**
 * @Author :huayanjun
 * @Data: 2019/8/30 16:09
 * 选择排序
 * 时间复杂度
 * 选出最小的，并将位置放在最前面，之后对剩余的数组进行重复操作
 */
public class SelectSort {
    public static void paixu(int [] nums){
        for (int i=0;i<nums.length-1;i++){
            int a=nums[i];
            int index=i;
            for (int j=i+1; j<nums.length;j++){
                if (a> nums[j]) {
                   a=nums[j];
                   index=j;
                }
            }
            int temp =nums[i];
            nums[i] = nums[index];
            nums[index]=temp;

        }
    }



    public static void main(String[] args) {
        int [] nums= {1,2,5,46,56,1};
        SelectSort.paixu(nums);
        for (int num:nums) {
            System.out.println(num);
        }
    }
}
