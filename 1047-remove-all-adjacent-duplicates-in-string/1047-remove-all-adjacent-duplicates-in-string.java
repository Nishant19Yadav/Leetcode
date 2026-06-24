class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();

        int left=0;
        for(int right =0;right<arr.length;right++){
            if(left>0 && arr[left-1] == arr[right]){
                left--;
            }else{
                arr[left]=arr[right];
                left++;
            }
        }
        return new String(arr,0,left);
    }
}