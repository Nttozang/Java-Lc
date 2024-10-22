package LC.Blind75.easy;

import java.util.Arrays;
import java.util.HashMap;

public class Twosum {

    private int[] nums;
    private int target;

    public Twosum(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public static void main(String[] args) {

        int[] nums1 = {2,7,11,15};
        int target1 = 9;

        int[] nums2 = {3,2,4};
        int target2 = 6;

        int[] nums3 = {3,3};
        int target3 = 6;

        Twosum twoSumNormalOne1 = new Twosum(nums1,target1);
        var result1 = twoSumNormalOne1.findTwoSumN();
        System.out.println(Arrays.toString(result1));

        Twosum twoSumNormalOne2 = new Twosum(nums2,target2);
        var result2 = twoSumNormalOne2.findTwoSumN();
        System.out.println(Arrays.toString(result2));

        Twosum twoSumNormalOne3 = new Twosum(nums3,target3);
        var result3 = twoSumNormalOne3.findTwoSumN();
        System.out.println(Arrays.toString(result3));

        System.out.println("=====================");

        Twosum twoSumh1 = new Twosum(nums1,target1);
        var result4 = twoSumh1.findTwoSumHashMap();
        System.out.println(Arrays.toString(result4));

        Twosum twoSumh2 = new Twosum(nums2,target2);
        var result5 = twoSumh2.findTwoSumHashMap();
        System.out.println(Arrays.toString(result5));

        Twosum twoSumh3 = new Twosum(nums3,target3);
        var result6 = twoSumh3.findTwoSumHashMap();
        System.out.println(Arrays.toString(result6));

    }
    public int[] findTwoSumN(){
        for (int i=0; i< nums.length; i++){
            for(int j=i+1; j< nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    public int[] findTwoSumHashMap(){
        HashMap<Integer,Integer> hs = new HashMap<>();
        //{2,7,11,15} ,9
        // keep value to hs
        for (int i = 0 ; i < nums.length; i++){
            int diff = target - nums[i];
            if (hs.containsKey(diff)){
                return new int[] {hs.get(diff),i};
            } hs.put(nums[i],i);//{2,0}
        }
        return null;
    }
}



