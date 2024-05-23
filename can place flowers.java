// Example 1:

// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true
// Example 2:

// Input: flowerbed = [1,0,0,0,1], n = 2
// Output: false

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    { 
        int c=0;
        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i]==0)
            {
                int prev=(i==0||flowerbed[i-1]==0)?0:1;
                int next=(i==flowerbed.length-1||flowerbed[i+1]==0)?0:1;
                if(prev==0 && next ==0)
                {
                    flowerbed[i]=1;
                    c++;
                }
            }
        }
        return c>=n;
            }
}