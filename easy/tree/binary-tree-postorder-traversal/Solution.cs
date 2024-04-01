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
    void print(TreeNode n, List<int> l){
        if(n==null){
            return;
        }
        print(n.left, l);
        print(n.right, l);
        l.Add(n.val);

    }
    public IList<int> PostorderTraversal(TreeNode root) {
        List<int> result= new List<int>();
        print(root, result);
        return result;
    }
}