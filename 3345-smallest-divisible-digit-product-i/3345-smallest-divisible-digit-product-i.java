class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int p = 1;
            int num =n;

            while(num>0){
                p *= (num%10);

                if(p%t==0){
                    return n;
                }
                num/=10;
            }
            n++;
        }
    }
}