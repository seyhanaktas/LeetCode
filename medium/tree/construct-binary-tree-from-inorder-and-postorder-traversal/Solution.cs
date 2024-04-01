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

    TreeNode build(int[] inorder, int[] postorder, int inorderStart, int inorderEnd, int postEnd){
        if(inorderStart>inorderEnd)
			return null;
        int rootVal= postorder[postEnd];

		int rootIndex=0;
		while(inorder[rootIndex]!=rootVal){
			rootIndex++;
		}
		TreeNode retVal= new TreeNode(rootVal);
        int rightLength = inorderEnd-rootIndex;
		retVal.left= build(inorder, postorder, inorderStart, rootIndex-1, postEnd-1-rightLength);
		retVal.right= build(inorder, postorder, rootIndex+1, inorderEnd, postEnd-1);
		return retVal;

    }

    public TreeNode BuildTree(int[] inorder, int[] postorder) {
        return build(inorder, postorder, 0, inorder.Length-1, inorder.Length-1);
    }
}