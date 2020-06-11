class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        for(int curr = 0; curr <= right; curr++){
            if(nums[curr] == 0){
                int temp = nums[left];
                nums[left] = nums[curr];
                nums[curr] = temp;
                left++;
            }else if(nums[curr] == 2){
                int temp = nums[right];
                nums[right] = nums[curr];
                nums[curr] = temp;
                right--;
                curr --;
            }
        }
        
       
    }
    
}
