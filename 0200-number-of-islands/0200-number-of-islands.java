class Solution {
    public int numIslands(char[][] grid) {
        int a=0;
       for(int i=0;i<grid.length;i++) {
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j] == '1'){
                a++;
                sol(grid,i,j);
            }
        }
       }
       return a;
    }
    private void sol(char[][] grid,int i,int j){
        if(i<0||j<0|| i>=grid.length || j>=grid[0].length || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';

        sol(grid,i+1,j);
        sol(grid,i-1,j);
        sol(grid,i,j+1);
        sol(grid,i,j-1);
    }

}