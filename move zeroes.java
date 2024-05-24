class Solution {
    public void moveZeroes(int[] num) {
        int inpos =0;
        for(int i=0;i<num.length;i++)
        {
            if (num[i]!=0)
            {
                num[inpos]=num[i];
                inpos++;
            }
        }

        while(inpos<num.length)
        {
            num[inpos++]=0;
        }
        
    }
}