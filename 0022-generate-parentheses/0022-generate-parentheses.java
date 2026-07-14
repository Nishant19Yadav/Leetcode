class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        solve(res,"",n,n);
        return res;
    }
    public void solve(ArrayList<String> res, String s, int l,int r ){
        if(l==0 && r==0){
            res.add(s);
            return;
        }
        if(l>0){
            solve(res,s+"(",l-1,r);
        }
        if(r>l){
            solve(res,s+")",l,r-1);
        }
    }
}