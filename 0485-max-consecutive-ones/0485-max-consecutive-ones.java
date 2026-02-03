class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int c=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                count=Math.max(count,c);
                c=0;
            }
            else c++;
        }
        return Math.max(c,count);
    }
}