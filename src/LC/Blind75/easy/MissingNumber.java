package LC.Blind75.easy;

import java.util.Arrays;

public class MissingNumber {

    private int[] nums;

    public MissingNumber(int[] nums) {
        this.nums = nums;
    }

    public static void main(String[] args) {

        int[] nums1 = {3,0,1};
        MissingNumber ms = new MissingNumber(nums1);
        var x = ms.missingNumberWithSum();
        System.out.println(x);

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        MissingNumber ms3 = new MissingNumber(nums3);
        var y = ms3.missingNumberWithXOR();
        System.out.println(y);
    }

    public int missingNumberWithSum(){

        //{3,0,1} = 4
        //{3,2,0,1} = 6
        int sum = 0 ;
        for(int i=0; i<nums.length;i++){
            sum += nums[i];
        }
        int actualSum = nums.length*((nums.length+1)/2); //n*((n+1)/2)
        return actualSum - sum;
    }

    public int missingNumberWithXOR(){

        /*Properties of XOR
        * Commutative : A + B = B + A
        * XOR WITH 0 : A + 0 = A
        * XOR WITH SELF : A + A = 0
        */
        int allXOR = 0;
        for(int i=0; i<= nums.length;i++){
            allXOR = allXOR ^ i; // nums.length = 9, (0 ^ 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 ^ 8 ^ 9)
        }
        for (int n : nums){ // nums = 9,(9 ^ 6 ^ 4 ^ 2 ^ 3 ^ 5 ^ 7 ^ 0 ^ 1)
            allXOR = allXOR ^ n;

            //result  (0 ^ 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 ^ 8 ^ 9) ^ (9 ^ 6 ^ 4 ^ 2 ^ 3 ^ 5 ^ 7 ^ 0 ^ 1)
            // XOR WITH SELF : A + A = 0
            // XOR = 8
        }
        return allXOR;
    }

}
