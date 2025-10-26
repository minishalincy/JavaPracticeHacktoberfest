class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;

        //step1
        int ind = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;

            }
        }
        //if no break points
        if(ind==-1){
            reverse(nums,0,n-1); // from 0 index to n-1
            return;
        }

        //step 2
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp = nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        //step 3
        reverse(nums,ind+1,n-1); // from break point to end of the array
        return;
    }
     // Helper method to reverse a subarray from start to end
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
