class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int in = n;
        int left = 0 , right = n-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]>=target){
                in = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return in;
    }
}