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

    bool hasPathSumInner(TreeNode root, TreeNode parent, int sum){
        if(root==null)
            if(parent.left==null&&parent.right==null)
                return sum==0;
            else
                return false;

        bool left=hasPathSumInner(root.left, root, sum-root.val);
        bool right=hasPathSumInner(root.right, root, sum-root.val);
        return left||right;

    }
    public bool HasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        else
            return hasPathSumInner(root, null, sum);
    }
}