// Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
// Example 1:
//
// Input: "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
//
//
//
// Note:
// In the string, each word is separated by single space and there will not be any extra space in the string.
//


class Solution {
    public String reverseWords(String s) {
        String[] ss=s.split(" ");
        String r="";
        for(int i=0;i<ss.length-1;++i){
            r+=new StringBuffer(ss[i]).reverse().toString()+" ";
        }
        return r+new StringBuffer(ss[ss.length-1]).reverse().toString();

    }
}
