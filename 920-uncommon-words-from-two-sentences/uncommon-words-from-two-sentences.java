// We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)
//
// A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
//
// Return a list of all uncommon words. 
//
// You may return the list in any order.
//
//  
//
//
//
//
//
// Example 1:
//
//
// Input: A = "this apple is sweet", B = "this apple is sour"
// Output: ["sweet","sour"]
//
//
//
// Example 2:
//
//
// Input: A = "apple apple", B = "banana"
// Output: ["banana"]
//
//
//  
//
// Note:
//
//
// 	0 <= A.length <= 200
// 	0 <= B.length <= 200
// 	A and B both contain only spaces and lowercase letters.
//
//
//


class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String,Integer> m=new HashMap<>();
        List<String> l=new ArrayList<String>();
        String[] r=null;
        Integer t=null;
        String[] s=A.split(" ");
        for(int i=0;i<s.length;++i){
            t=m.get(s[i]);
            if(t!=null)
                m.put(s[i],t+1);
            else m.put(s[i],1);
        }
        s=B.split(" ");
        for(int i=0;i<s.length;++i){
            t=m.get(s[i]);
            if(t!=null)
                m.put(s[i],t+1);
            else m.put(s[i],1);
        }
        Set<String> set=m.keySet();
        for(String str:set){
            if(m.get(str)==1)
                l.add(str);
        }
        r=new String[l.size()];
        for(int i=0;i<l.size();++i)
            r[i]=l.get(i);
        return r;
    }
}
