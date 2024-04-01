/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    int getHeight(TreeNode root)
    {
        if (root == null)
            return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if (left > right)
            return left+1;
        else
            return right+1;
    }
    string getLine(TreeNode node, int i)
    {
        if (i == 0)
        {
            if (node == null)
                return "null";
            else
                return node.val.ToString();
        }
        else
        {
            if (node != null)
            {
                string result = "";
                result+= getLine(node.left, i - 1);
                result +=","+ getLine(node.right, i - 1);
                return result.Trim(',');
            }
            else {
                return "";
            }
        }
    }

    public string serialize(TreeNode root)
    {
        int h = getHeight(root);
        string totalResult = "";
        for (int i = 0; i < h; i++)
        {
            string line = getLine(root, i);
            if(!String.IsNullOrEmpty(line))
                totalResult += line+",";
        }
        totalResult = totalResult.TrimEnd(',');
        return "[" + totalResult + "]";
    }

    Object[] build(TreeNode root, string[] data, int startIndex, int i)
    {
        if (i == 0)
        {
            if (startIndex>= data.Length || data[startIndex] == "null")
            {
                root = null;
            }
            else
            {
                root= new TreeNode(Convert.ToInt32(data[startIndex]));
            }
            startIndex++;
            return new object[] { root, startIndex};
        }
        else
        {
            if (root == null)
                    return new object[] { root, startIndex };
            Object[] left= build(root.left, data, startIndex, i - 1);
            root.left = (TreeNode)left[0];
            startIndex = (int)left[1];
            Object[]  right= build(root.right, data, startIndex, i - 1);
            root.right = (TreeNode)right[0];
            startIndex = (int)right[1];
            return new object[] { root, startIndex};
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(string data)
    {
        if(data=="[]")
            return null;
        int height = 0;
        int sum = 0;
        data = data.TrimStart('[');
        data = data.TrimEnd(']');
        string[] dataArr = data.Split(',');
        int numberOfNodes = dataArr.Length;
        while (sum < numberOfNodes)
        {
            sum += (int)Math.Pow(2, height);
            height++;
        }
        TreeNode root = null;
        int startIndex = 0;
        int level = 0;
        while(startIndex< numberOfNodes)
        {
            Object[] res = build(root, dataArr, startIndex, level);
            root = (TreeNode)res[0];
            startIndex = (int)res[1];
            level++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));