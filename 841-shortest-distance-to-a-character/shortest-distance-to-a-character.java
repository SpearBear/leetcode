// Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.
//
// Example 1:
//
//
// Input: S = "loveleetcode", C = 'e'
// Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
//
//
//  
//
// Note:
//
//
// 	S string length is in [1, 10000].
// 	C is a single character, and guaranteed to be in string S.
// 	All letters in S and C are lowercase.
//
//


class Solution {
    public int[] shortestToChar(String S, char C) {
        int li=S.length(),ri=0,l=S.length();
        int[] left=new int[l];
        int[] right=new int[l];
        for(int i=0;i<l;++i){
            if(S.charAt(i)==C){
                left[i]=0;
                li=i;
            }
            else left[i]=i-li;
        }
        for(int i=l-1;i>=0;--i){
            if(S.charAt(i)==C){
                right[i]=0;
                ri=i;
            }
            else right[i]=ri-i;
        }
        for(int i=0;i<l;++i){
            if(right[i]<0||(left[i]>0&&left[i]<right[i]))
                right[i]=left[i];
        }
        return right;
    }
}
