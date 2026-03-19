class Solution {
    public int findClosest(int x, int y, int z) {
        int b=Math.abs(z-x);
        int a =Math.abs(z-y);
        if(b>a) return 2;
        else if(b<a) return 1;
        else return 0;
        
        
    }
}