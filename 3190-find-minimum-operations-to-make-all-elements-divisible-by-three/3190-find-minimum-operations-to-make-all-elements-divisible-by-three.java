class Solution {
    public int minimumOperations(int[] nums) {
        int opps=0;
        for(int n: nums){
            if(n%3!=0)opps++;
           
        }
        return opps;

    }
}