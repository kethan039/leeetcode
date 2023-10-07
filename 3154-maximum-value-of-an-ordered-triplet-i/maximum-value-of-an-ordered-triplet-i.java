class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                   ans = Math.max(ans, ((long)nums[i] - (long)nums[j]) * nums[k]);
                }
            }
        }
        long k=0;
        if(ans<k){
            ans=k;
        }
        return ans;
    }
}