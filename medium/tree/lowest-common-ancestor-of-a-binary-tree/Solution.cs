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

    bool contains(TreeNode root, TreeNode p){
        if(root==null)
            return false;
        if(root==p){
            return true;
        }else{
            bool ok=contains(root.left, p);
            if(!ok)
                ok=contains(root.right, p);
            return ok;
        }

    }

    Object[] getMin(TreeNode root, TreeNode p, TreeNode q, int level){
        if(root==null)
            return null;
        if(contains(root, p) && contains(root, q)){
            Object[] min=new Object[]{root, level};
            Object[] left= getMin(root.left, p, q, level+1);
            if(left!=null && (int)left[1]>level)
                min =left;
            Object[] right= getMin(root.right, p, q, level+1);
            if(right!=null && (int)right[1]>level)
                min =right;
            return min;
        }else{
            return null;
        }
    }

    public TreeNode LowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Object[] minAncs = getMin(root, p, q, 0);
        return (TreeNode)minAncs[0];
    }
}