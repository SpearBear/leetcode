// Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
//
//  
//
//
// Example 1:
//
//
// Input: "Hello"
// Output: "hello"
//
//
//
// Example 2:
//
//
// Input: "here"
// Output: "here"
//
//
//
// Example 3:
//
//
// Input: "LOVELY"
// Output: "lovely"
//
//
//
//
//


class Solution {
   	public String toLowerCase(String str) {
		char u = 'A'-1;
		char l = 'a'-1;
		for (int i = 0; i != 26; ++i) {
			u ++;
			l ++;
			str = str.replace(u, l);
		}
		return str;
	}
}
