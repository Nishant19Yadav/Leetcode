class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        traverse(root, list);

        Collections.sort(list);

        return list.get(k - 1);
    }

    private void traverse(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;

        list.add(root.val);
        traverse(root.left, list);
        traverse(root.right, list);
    }
}