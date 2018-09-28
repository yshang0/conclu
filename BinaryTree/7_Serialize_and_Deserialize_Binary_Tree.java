//7_Serialize_and_Deserialize_Binary_Tree


public String serialize(TreeNode root) {
    if (root == null) {
        return " ";
    }
    StringBuffer result = new StringBuffer();

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while (q.size() != 0) {
        TreeNode cur = q.poll();
        if(cur == null) {
            result.append("#");
            result.append(" ");
        } else {
            result.append(cur.val);
            result.append(" ");
            q.add(cur.left);
            q.add(cur.right);

        }
    }
    String s = result.toString();
    return s;
}

/**
 * This method will be invoked second, the argument data is what exactly
 * you serialized at method "serialize", that means the data is not given by
 * system, it's given by your own serialize method. So the format of data is
 * designed by yourself, and deserialize it here as you serialize it in 
 * "serialize" method.
 */

public TreeNode deserialize(String data) {
    String[] str = data.split(" ");
    
    int l = str.length;
    if (l == 0) {
        return null;
    }
    int index = 1;
    Queue<TreeNode> q = new LinkedList<>();
    TreeNode root = new TreeNode(Integer.valueOf(str[0]));
    q.add(root);
    while (index < l) {

        TreeNode cur = q.poll();
        if(cur != null) {
            if(!str[index].equals("#")) {
                cur.left = new TreeNode(Integer.valueOf(str[index++]));
                q.add(cur.left);
            } else {
                index++;
            }
            if(!str[index].equals("#")) {
                cur.right = new TreeNode(Integer.valueOf(str[index++]));
                q.add(cur.right);
            } else {
                index++;
            }
        }
    }
    return root;
}
//Time O(n); n= nodes;
//space 1:O(nodes)
//      2:O(nodes)