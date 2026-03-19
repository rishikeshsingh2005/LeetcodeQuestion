class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int y=x;
        int p=0;
        while(x!=0){
            int r = x%10;
            p=p*10+r;
            x/=10;
        }
        if (y==p) return true;
        else return false;
    }
}