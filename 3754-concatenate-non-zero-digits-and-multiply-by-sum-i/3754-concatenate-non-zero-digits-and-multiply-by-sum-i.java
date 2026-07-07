class Solution {
    public long sumAndMultiply(int n) {
        int sum =0;
        String s = String.valueOf(n);     
        int[] arr = new int[s.length()];

        for(int i=0;i<s.length();i++){
            arr[i] = s.charAt(i)-'0';
        }

        int narr = 0;
        int arr1[] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                sum += arr[i];
                arr1[narr++] = arr[i];
            }
        }
        int num = 0;

        for (int i=0;i<narr;i++) {
         num = num * 10 + arr1[i];
        }

        return (long)num*sum;
        

    }
}