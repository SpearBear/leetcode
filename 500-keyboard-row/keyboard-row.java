// Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below. 
//
//
//
//
//
//
//
// Example 1:
//
// Input: ["Hello", "Alaska", "Dad", "Peace"]
// Output: ["Alaska", "Dad"]
//
//
//
// Note:
//
// You may use one character in the keyboard more than once.
// You may assume the input string will only contain letters of alphabet.
//
//


class Solution {
    public String[] findWords(String[] words) {
        List<String> l=new ArrayList<>();
        l.add("qwertyuiop");
        l.add("asdfghjkl");
        l.add("zxcvbnm");
        String s=null;
        String[] rs=null;
        List<String> r=new ArrayList<String>();
        int t=0;
        int[] table=new int[26];
        for(int i=0;i<3;++i){
            s=l.get(i);
            for(int j=0;j<s.length();++j){
                table[s.charAt(j)-'a']=i;
            }
        }
        for(int i=0;i<words.length;++i){
            s=words[i].toLowerCase();
            t=table[s.charAt(0)-'a'];
            for(int j=1;j<s.length();++j)
                if(t!=table[s.charAt(j)-'a']){
                    t=-1;
                }
            if(t!=-1)
                r.add(words[i]);
        }
        rs=new String[r.size()];
        for(int i=0;i<r.size();++i)
            rs[i]=r.get(i);
        return rs;
    }
}
