class Solution {
    public int maxProduct(int n) {
   int max=0,max2=0;
   while(n!=0){
    int last=n%10;
    if(last>max){
        max2 =max;
        max =last;
    }
    else if(last>max2){
        max2 = last;
    }
    n=n/10;
   }  
   return max*max2;   
    }
}