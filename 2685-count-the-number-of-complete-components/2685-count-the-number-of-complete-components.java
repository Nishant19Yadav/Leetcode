class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean[] vis = new boolean[n];
        int result=0;
        
        for(int i=0;i<n;i++){
            if(!vis[i]){
                List<Integer> component = new ArrayList<>();
                dfs(i,adj,vis,component);
                int nodes = component.size();
                int cnt=0;
                for(int node:component){
                    cnt+=adj.get(node).size();
                }
                cnt/=2;

                if(cnt==nodes*(nodes-1)/2){
                    result++;
                }
            }
        }
        return result;
    }
    private void dfs(int node,List<List<Integer>> adj,boolean[] vis,List<Integer> component){
        vis[node]=true;
        component.add(node);
        for(int nei:adj.get(node)){
            if(!vis[nei]){
                dfs(nei,adj,vis,component);
            }
        }
    }
}