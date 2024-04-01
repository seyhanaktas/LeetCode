/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;

        boolean left = isValidBST(root.val, null, root.left);
        boolean right = isValidBST(null, root.val, root.right);

        return left&right;

    }

    boolean isValidBST(Integer max,Integer min, TreeNode root){
        if(root==null)
            return true;

        if((min==null || root.val>min) && (max==null || root.val<max)){
            return isValidBST(root.val, min,root.left) & isValidBST(max, root.val,root.right);
        }else{
            return false;
        }
    }

}