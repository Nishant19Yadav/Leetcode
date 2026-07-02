class Solution {

    ArrayList<Integer> list = new ArrayList<>();

    public boolean findTarget(TreeNode root, int k) {

        solve(root);

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            int sum = list.get(left) + list.get(right);

            if (sum == k)
                return true;

            if (sum < k)
                left++;
            else
                right--;
        }

        return false;
    }

    private void solve(TreeNode root) {

        if (root == null)
            return;

        solve(root.left);
        list.add(root.val);
        solve(root.right);
    }
}