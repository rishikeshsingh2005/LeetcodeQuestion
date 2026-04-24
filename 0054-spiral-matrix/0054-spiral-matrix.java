class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> res = new ArrayList<>();
        int top = 0,bottom = a.length - 1;
        int left = 0,right = a[0].length - 1;
      while (top <= bottom && left <= right) {
        for (int i = left;i <= right; i++)
         res.add(a[top][i]);
         top++;
          for (int i = top; i <= bottom; i++)
           res.add(a[i][right]);
            right--;
              if (top <= bottom) {
                for (int i = right; i >= left; i--)
                 res.add(a[bottom][i]);
                  bottom--;
                   }
                   if (left <= right) {
                      for (int i = bottom; i >= top; i--)
                          res.add(a[i][left]);
                          left++;

  }
        }
        return  res;
    }
}

        
