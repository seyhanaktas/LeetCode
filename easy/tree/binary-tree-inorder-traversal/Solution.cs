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
    public IList<int> InorderTraversal(TreeNode root) {
        List<int> res=new List<int>();
        Stack<TreeNode> parents =new Stack<TreeNode>();
        TreeNode it =root;
        while(it != null || parents.Count> 0){

            if(it != null){
                parents.Push(it);
                it=it.left;
            }
            else{
                it= parents.Pop();
                res.Add(it.val);
                it= it.right;
            }
        }
        return res;
    }
}