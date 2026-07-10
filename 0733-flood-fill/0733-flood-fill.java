class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m = image[0].length;

        int oldcolor = image[sr][sc];

        boolean[][] vis = new boolean[n][m];

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr,sc});
        vis[sr][sc] = true;
        image[sr][sc] = color;

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
                int[] cell= q.poll();
                int a = cell[0];
                int b = cell[1];
                for(int[] d:dir){
                    int x = a+d[0];
                    int y = b+d[1];

                    if(x>=0 && x<n  && y>=0 && y<m && !vis[x][y] && image[x][y]==oldcolor){
                        vis[x][y] = true;
                        image[x][y]=color;
                        q.offer(new int[] {x,y});
                    }
                }
        }
        return image;


 
    }
}