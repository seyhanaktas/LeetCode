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
    int getHeight(TreeNode n){
        if(n==null){
            return 0;
        }
        int l= getHeight(n.left);
        int r= getHeight(n.right);
        if(l>r)
            return ++l;
        return ++r;

    }
    void getList(TreeNode n, int level, List<int> res){
        if(n==null)
            return;
        if(level==0){
            res.Add(n.val);
        }else{
            getList(n.left,level-1, res);
            getList(n.right,level-1, res);
        }
        return ;
    }
    public IList<IList<int>> LevelOrder(TreeNode root) {

        IList<IList<int>> res =new List<IList<int>>();
        int height= getHeight(root);
        for(int i=0;i<height;i++){
            List<int> ress = new List<int>();
            getList(root, i, ress);
            res.Add(ress);
        }
        return res;
    }
}