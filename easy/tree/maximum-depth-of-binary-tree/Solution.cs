/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int MaxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else{
            int l=MaxDepth(root.left);
            int r = MaxDepth(root.right);
            if(l>r)
                return ++l;
            return ++r;
        }
    }
}