//Example 1:

// Input: str1 = "ABCABC", str2 = "ABC"
// Output: "ABC"
// Example 2:

// Input: str1 = "ABABAB", str2 = "ABAB"
// Output: "AB"
// Example 3:

// Input: str1 = "LEET", str2 = "CODE"
// Output: ""
// if string 2 is greater than string 1 then swap the 2 strings


class Solution {
    public String gcdOfStrings(String str1, String str2)
    {
       if(str2.length()>str1.length())
       {
        return gcdOfStrings(str2,str1);
       }   
       if(str2.equals(str1))
       {
        return str1;
       }  
       if(str1.startsWith(str2))  
       {
        return gcdOfStrings(str1.substring(str2.length()),str2);
       } 
       return "";

    }
}


// approach 2
class Solution {
    public String gcdOfStrings(String str1, String str2)
    {
        if ((str1+str2).equals(str2+str1))
        {
         int a=str1.length();
         int b=str2.length();
         int gcd=gcd(a,b);
        return str1.substring(0,gcd);
        }
        else
        {
        return "";
        }
    }
//GCD code  
    int gcd(int a,int b)
    {
        while(b%a!=0)
        {
            int temp = b%a;
            b=a;
            a=temp;
        }
        return a;
    }
}




