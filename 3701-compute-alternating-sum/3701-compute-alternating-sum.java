class Solution {
    public int alternatingSum(int[] nums) {
        int n=nums.length;
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even=even+nums[i];
            }
            else{
                odd=odd+nums[i];
            }
        }
           return even-odd;
    }
 
}