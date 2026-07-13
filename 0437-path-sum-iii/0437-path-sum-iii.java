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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
        {
            return 0;
        }
        return countPath(root,targetSum) + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
    }
    public int countPath(TreeNode root,long remainingSum)
    {
        if(root==null)
        {
            return 0;
        }
        int count=0;
        if(root.val==remainingSum)
        {
            count++;
        }
        count+=countPath(root.left,remainingSum-root.val);
        count+=countPath(root.right,remainingSum-root.val);
        return count;
    }
}