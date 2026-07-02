
class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
       solve(root);
       return solution(list,k);

    }
    private void solve(TreeNode root){
        if(root == null) return;

        solve(root.left);
        list.add(root.val);
        solve(root.right);
    }
    private boolean solution(ArrayList<Integer> list,int k){
        
    HashSet<Integer> mp = new HashSet<>();
        for(int num:list){
            int comp = k-num;
            if(mp.contains(comp)){
                return true;
            }
            mp.add(num);
        }
        return false;
    }

}