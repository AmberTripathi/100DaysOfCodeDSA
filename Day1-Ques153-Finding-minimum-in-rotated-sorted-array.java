class Solution {
    public int findMin(int[] nums) {
        int a=nums[0];
        
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]>nums[i+1]) {
                a=nums[i+1];
            }
        }
        return a;
        }   
    }
