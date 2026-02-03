class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans=new int[2*n];
        int i=0;
        int k=0;
        while (i<2*n){
            ans[i]=nums[k];
            i++;
            ans[i]=nums[k+n];
            i++;
            k++;
        }
        return ans;
    }
}