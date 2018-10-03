// Given an n-ary tree, return the preorder traversal of its nodes' values.
//  
//
// For example, given a 3-ary tree:
//
//
//  
//
// Return its preorder traversal as: [1,3,5,6,2,4].
//  
//
// Note: Recursive solution is trivial, could you do it iteratively?


/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    List<Integer> l=new ArrayList<>();
    void pre(Node n){
        if(n==null)
            return;
        l.add(n.val);
        for(Node nd:n.children){
            pre(nd);
        }
    }
    public List<Integer> preorder(Node root) {
        pre(root);
        return l;
    }
}
