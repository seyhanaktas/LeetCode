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

TreeNode build(int[] inorder, int[] preorder, int inorderStart, int inorderEnd, int preorderstart)
        {
            if (inorderStart > inorderEnd )
                return null;
            int rootVal = preorder[preorderstart];

            int rootIndex = 0;
            while (inorder[rootIndex] != rootVal)
            {
                rootIndex++;
            }
            TreeNode retVal = new TreeNode(rootVal);
            int lengthOfInOrderLeft = rootIndex - 1 - inorderStart + 1;
            retVal.left = build(inorder, preorder, inorderStart, rootIndex - 1, preorderstart + 1);
            retVal.right = build(inorder, preorder, rootIndex + 1, inorderEnd, preorderstart + 1 + lengthOfInOrderLeft);
            return retVal;

        }
    public TreeNode BuildTree(int[] preorder, int[] inorder) {
        return build(inorder, preorder, 0, inorder.Length-1, 0);
    }
}