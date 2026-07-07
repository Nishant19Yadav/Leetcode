class Solution {
    public void wiggleSort(int[] nums) {
        int n =nums.length;
        Arrays.sort(nums);

        int mid = (n+1)/2;

        int[] arr1 = new int[mid];
        int[] arr2 = new int[n-mid];
        
        for(int i=0;i<mid;i++){
            arr1[i] = nums[i];
        }
        for(int i=mid;i<n;i++){
            arr2[i-mid]=nums[i];
        }

        int[] ans = new int[n];
        int a = arr1.length - 1;
        int b = arr2.length - 1;
        int k = 0;

        while (a >= 0 && b >= 0) {
            ans[k++] = arr1[a--];
            ans[k++] = arr2[b--];
        }

        while (a >= 0) {
            ans[k++] = arr1[a--];
        }

        while (b >= 0) {
            ans[k++] = arr2[b--];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = ans[i];
        }
    }
}