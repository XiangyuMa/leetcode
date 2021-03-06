
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//
//
// 示例:
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
//
// Related Topics 数组 哈希表

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int nums[] = new int[]{2,34,54,232,54,6};
        int arr[] =  solution.twoSum(nums,60);
        for (int anArr : arr) {
            System.out.println(anArr);
        }

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

    //暴力破解
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    //hashmap查找
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
                map.put(nums[i],i);
        }
        for(int i = 0;i<nums.length;i++){
            int other = target - nums[i];
            if(map.containsKey(other) && map.get(other) != i){
                return new int[]{i,map.get(other)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
}