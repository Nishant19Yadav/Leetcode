class BSTIterator {
    private List<Integer> list;
    private int idx;

    public BSTIterator(TreeNode root) {
        list = new ArrayList<>();
        idx =0;
        inorder(root);
    }
    private void inorder(TreeNode node){
        if(node == null) return;
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }
    
    public int next() {
        return list.get(idx++);
    }
    
    public boolean hasNext() {
        return idx<list.size();
    }
}