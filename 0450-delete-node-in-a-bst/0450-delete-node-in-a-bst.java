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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(root.val == key){
            return sol(root);
        }
        TreeNode dummy = root;
        while(root != null){
            if(root.val <= key){
                if(root.right != null && root.right.val == key){
                    root.right = sol(root.right);
                    break;
                }else{
                    root = root.right;
                }
            }else{
                if(root.left != null && root.left.val == key){
                    root.left = sol(root.left);
                    break;
                }else{
                    root = root.left;
                }
            }
        }
        return dummy;
    }
    TreeNode sol(TreeNode root){
        if(root.left == null){
            return root.right;
        }else if(root.right ==null){
            return root.left;
        }
        TreeNode rightchild = root.right;
        TreeNode lastright = findlastright(root.left);
        lastright.right = rightchild;
        return root.left;
    }
    TreeNode findlastright(TreeNode root){
        if(root.right == null){
            return root;
        }
        return findlastright(root.right);
    }
}