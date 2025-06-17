/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        class Traverse {
            Traverse(TreeNode root)
            {
                if(root.left!=null)
                {
                    new Traverse(root.left);
                }
                if(root.right!=null)
                {
                    new Traverse(root.right);
                }
                result.add(root.val);
            }
        }
        if(root!=null)
        {
            new Traverse(root);
        }
        return result;
        
    }
}