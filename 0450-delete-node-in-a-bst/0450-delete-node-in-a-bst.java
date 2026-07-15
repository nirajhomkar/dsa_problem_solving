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
    int successor=0;
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
        {
            return null;
        }
        if(root.val>key)
        {
            root.left=deleteNode(root.left,key);
        }
        if(root.val<key)
        {
            root.right=deleteNode(root.right,key);
        }
        if(root.val==key)
        {
            if(root.left==null && root.right==null)
            {
                return null;
            }
            if(root.left!=null && root.right==null)
            {
                return root.left;
            }
            if(root.left==null && root.right!=null)
            {
                return root.right;
            }
            TreeNode successor = inOrderSucc(root.right);
            root.val=successor.val;
            root.right=deleteNode(root.right,successor.val);
            
        }
        return root;
    }
    public TreeNode inOrderSucc(TreeNode root)
    {
        
        if(root==null)
        {
            return null;
        }
        if(root.left==null)
        {
            return root;
        }
        return inOrderSucc(root.left);
    }
}