// Example 1:

// Input: s = "hello"
// Output: "holle"
// Example 2:

// Input: s = "leetcode"
// Output: "leotcede"




class Solution {
    public String reverseVowels(String s) {
        char [] arr=s.toCharArray(); //converting string to a character array.
        int li=0;
        int ri=arr.length-1;
        while(li<ri)
        {
          char ch1=arr[li];
          char ch2=arr[ri];
          if (isVowel(ch1) && isVowel(ch2))
          {
            arr[li]=ch2;
            arr[ri]=ch1;
            li++;
            ri--;

          }
          else if (isVowel(ch1))
          {
             ri--;
          }
          else if(isVowel(ch2))
          {
            li++;
          }
          else
          {
            li++;
            ri--;
          }
        }
        return new String(arr);
    }
    boolean isVowel(char ch)
    {
        if(ch=='a'|| ch=='A')
        {
          return true;
        }
        else if(ch=='e'|| ch=='E')
        {
          return true;  
        }
        else if(ch=='i'|| ch=='I')
        {
          return true;  
        }
        else if(ch=='o'|| ch=='O')
        {
          return true;  
        }
        else if(ch=='u'|| ch=='U')
        {
         return true;   
        }
        else 
        {
            return false;
        }
    }
}