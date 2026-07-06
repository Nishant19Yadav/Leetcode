class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int cnt=0;

        for(int i=0;i<n;i++){
            boolean cover = false;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(intervals[j][0] <= intervals[i][0] &&
                intervals[j][1] >= intervals[i][1]){
                    cover = true;
                    break;
                }
            }
            if(!cover){
                cnt++;
            }
        }
        return cnt;
    }
}