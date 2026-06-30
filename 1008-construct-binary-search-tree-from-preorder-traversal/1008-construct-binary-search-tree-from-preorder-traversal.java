
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return solve(preorder,Integer.MAX_VALUE,new int[]{0});
    }

    public TreeNode solve(int[] preorder,int up,int[] i){
        if(i[0]==preorder.length || preorder[i[0]]>up) return null;
        TreeNode root = new TreeNode(preorder[i[0]++]);
        root.left = solve(preorder,root.val,i);
        root.right = solve(preorder,up,i);
        return root;
    }
}