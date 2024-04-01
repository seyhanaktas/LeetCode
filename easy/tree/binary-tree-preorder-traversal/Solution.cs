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
    public IList<int> PreorderTraversal(TreeNode root) {
		List<int> result=new List<int>();
		Stack<TreeNode> parents=new Stack<TreeNode>();
		TreeNode cn= root;
        while(cn!=null || parents.Count>0){
			if(cn!=null)
				result.Add(cn.val);
			if(cn!=null){
				parents.Push(cn);
				cn=cn.left;
			}else{
				cn=parents.Pop();
				cn= cn.right;
			}
		}
        return result;
    }
}