// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"


class Solution {
    public String reverseWords(String s) {
    String [] words=s.trim().split(" ");
    StringBuilder sb = new StringBuilder();
    for(int i=words.length-1;i>=0;i--)
    {
        if(words[i].length()>0)
        {
            sb.append(words[i]);
            sb.append(" ");
        }
    }
     return sb.substring(0,sb.length()-1).toString(); //to remove the last space of the string
        
    }
}