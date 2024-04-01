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
    int getHeight(Node root)
    {
        if (root == null)
            return 0;
        else
        {
            int left = getHeight(root.left);
            int right = getHeight(root.right);
            if (left > right)
                return left + 1;
            else
                return right + 1;
        }
    }
    void traverse(Node start, int level, int height)
    {
        if (start == null || level >= height)
            return;

        List<Node> sblings = new List<Node>();
        while (start != null)
        {
            if (start.left != null)
            {
                sblings.Add(start.left);
            }
            if (start.right != null)
            {
                sblings.Add(start.right);
            }
            start = start.next;
        }
        if (sblings.Count == 0)
            return;
        for (int i = 0; i < sblings.Count - 1; i++)
        {
            sblings[i].next = sblings[i + 1];
        }
        traverse(sblings[0], level + 1, height);
    }
    public Node Connect(Node root)
    {
        int height = getHeight(root);
        traverse(root,  0, height);

        return root;
    }
}