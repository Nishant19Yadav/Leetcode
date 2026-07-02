class Solution {
    ArrayList<TreeNode> list = new ArrayList<>();
    public void recoverTree(TreeNode root) {
        solve(root);
        solution();
    }
    private void solve(TreeNode root){
    if(root==null) return;

    solve(root.left);
    list.add(root);
    solve(root.right);
    }
    private void solution(){
        TreeNode first = null;
        TreeNode sec = null;

        for(int i=1;i<list.size();i++){
            if(list.get(i-1).val>list.get(i).val){
                first = list.get(i-1);
                break;
            }
        }
        for(int i=list.size()-1;i>0;i--){
            if (list.get(i).val < list.get(i - 1).val) {
                sec= list.get(i);
                break;
            }
        }
        int temp = first.val;
        first.val = sec.val;
        sec.val = temp;
    }

}