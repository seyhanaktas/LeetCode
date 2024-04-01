/*
// Definition for a Node.
public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
*/

public class Solution {
    int getHeight(Node root){
        if(root==null)
            return 0;
        else{
            int left=getHeight(root.left);
            return ++left;
        }
    }
    void traverse(Node start, Node next, int level){
        if(level==0)
        {
            start.next= next;
        }
        else{
            traverse(start.left, start.right, level-1);
            traverse(start.right, next.left, level-1);
            traverse(next.left, next.right, level-1);
        }
    }
    public Node Connect(Node root) {
        int height= getHeight(root);
        for(int i=1;i<height;i++){
            traverse(root.left, root.right, i-1);
        }
        return root;
    }
}