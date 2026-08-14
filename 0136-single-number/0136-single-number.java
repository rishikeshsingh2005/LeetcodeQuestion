class Solution {
    public int singleNumber(int[] nums) {
      int x=0;
      for(int p:nums)  {
        x=x^p;
      }
      return x;
    }
}