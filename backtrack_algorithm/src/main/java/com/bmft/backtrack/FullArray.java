package com.bmft.backtrack;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author Jarvan
 * @create 2020/9/16 11:36
 * 全排列算法
 * 要求输入一组不重复的数字返回他的全排列.
 * 类似 1,2,3 这3个数字的组成的可能.
 */
public class FullArray {
    /**
     * result全排列的结果集.
     */
    private List<List<Integer>> result = new LinkedList<>();

    /**
     * 返回全排列结果 get  permute result.
     *
     * @param nums 结束条件，这里是全部结构都在track 【路径】中出现.
     * @return 返回全排列的结果 result.
     */
    public List<List<Integer>> getPermuteResult(int[] nums) {
        // 记录「路径」不同于 result 的结果
        LinkedList<Integer> track = new LinkedList<>();
        return backtrack(nums, track);
    }

    /**
     * 对成员变量 result 进行【回溯算法】排列.
     *
     * @param nums  nums 是选择列表和结束条件当 选择列表==路径 的时候就结束
     * @param truck truck 是对路径的记录
     */
    public List<List<Integer>> backtrack(int[] nums, LinkedList<Integer> truck) {

        //判断及结束条件是否成立
        if (truck.size() == nums.length) {
            result.add(truck);
        }
        //遍历选择列表
        for (int i = 0; i < nums.length; i++) {
            //如果选择列表里的值已经存在于路径中.就条过这个循环分支.
            if (truck.contains(nums[i])) {
                continue;
            }
            //按照顺序做出选择
            truck.add(nums[i]);
            //递归的回溯算法，
            backtrack(nums, truck);
            //取消选择,为了可以原路放回.
            truck.removeLast();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        FullArray fullArray = new FullArray();
        fullArray.getPermuteResult(nums);
        for (List<Integer> integers : fullArray.result) {
            System.out.println("--");
            System.out.println(integers);
        }
        List<List<Integer>> permuteResult = new FullArray().getPermuteResult(nums);
        System.out.println(permuteResult.size());
        for (List<Integer> integers : permuteResult) {
            System.out.println("integers.size()=" + integers.size());
        }
    }

}
