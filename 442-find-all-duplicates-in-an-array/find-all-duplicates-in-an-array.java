// Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//
// Find all the elements that appear twice in this array.
//
// Could you do it without extra space and in O(n) runtime?
//
// Example:
//
// Input:
// [4,3,2,7,8,2,3,1]
//
// Output:
// [2,3]
//


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<Integer>();
        int t=0;
        for(int i=0;i<nums.length;++i){
            t=nums[i];
            if(t<0)
                t=-t;
            if(nums[t-1]<0)
                l.add(t);
            else{
                nums[t-1]=-nums[t-1];
            }
        }
        return l;
    }
}
