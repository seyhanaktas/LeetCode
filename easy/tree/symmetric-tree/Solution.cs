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

    public bool IsSymmetric(TreeNode root) {

        List<int> r1 =new List<int>();
        Stack<TreeNode> sl =new Stack<TreeNode>();
        Stack<TreeNode> sr =new Stack<TreeNode>();
        TreeNode iL = root;
        TreeNode iR = root;
        while(iL!=null || iR!=null || sl.Count>0 || sr.Count>0){

            if((iR!=null&&iL!=null && iR.val!=iL.val) || (iL ==null && iR!=null) ||(iR==null && iL!=null))
                return false;

            if(iL!=null && iR!=null){

                sl.Push(iL);
                iL=iL.left;

				sr.Push(iR);
				iR=iR.right;

            }else{
                iL=sl.Pop();
                iL=iL.right;

                iR=sr.Pop();
                iR=iR.left;
            }
        }
        return true;
    }
}