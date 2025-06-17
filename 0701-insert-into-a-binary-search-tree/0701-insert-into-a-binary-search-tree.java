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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode k = root;
        if(k==null) 
        return new TreeNode(val);
         if(k.val<val) k.right=insertIntoBST(k.right,val);
        else  k.left=insertIntoBST(k.left,val);
        return k;
    }
}