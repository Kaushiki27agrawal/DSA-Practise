class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int [] ans=new int[2*n];
        int k=0;
        for (int i=0;i<n;i++){
           ans[k]=nums[i];
           k++;
        }
        for (int i=0;i<n;i++){
           ans[k]=nums[i];
           k++;
        }
        return ans;
    }
}