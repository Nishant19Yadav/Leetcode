class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        ArrayList<Integer> list = new ArrayList<>();
        for(int[] row:grid){
            for(int num:row){
                list.add(num);
            }
        }
        int size = list.size();
        k%=size;
        Collections.rotate(list,k);

        List<List<Integer>> ans = new ArrayList<>();
        int idx=0;
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<m;j++){
                row.add(list.get(idx++));

            }
            ans.add(row);
        }
        return ans;


    }
}