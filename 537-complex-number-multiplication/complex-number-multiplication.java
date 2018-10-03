//
// Given two strings representing two complex numbers.
//
//
// You need to return a string representing their multiplication. Note i2 = -1 according to the definition.
//
//
// Example 1:
//
// Input: "1+1i", "1+1i"
// Output: "0+2i"
// Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
//
//
//
// Example 2:
//
// Input: "1+-1i", "1+-1i"
// Output: "0+-2i"
// Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
//
//
//
// Note:
//
// The input strings will not have extra blank.
// The input strings will be given in the form of a+bi, where the integer a and b will both belong to the range of [-100, 100]. And the output should be also in this form.
//
//


class Solution {
    public String complexNumberMultiply(String a, String b) {
        String as[]=a.split("\\+");
        String bs[]=b.split("\\+");
        int ai[]=new int[2];
        int bi[]=new int[2];
        int ri[]=new int[2];
        ai[0]=Integer.parseInt(as[0]);
        ai[1]=Integer.parseInt(as[1].substring(0,as[1].length()-1));
        bi[0]=Integer.parseInt(bs[0]);
        bi[1]=Integer.parseInt(bs[1].substring(0,bs[1].length()-1));
        ri[0]=ai[0]*bi[0]-ai[1]*bi[1];
        ri[1]=ai[1]*bi[0]+ai[0]*bi[1];
        return ri[0]+"+"+ri[1]+"i";
    }
}
