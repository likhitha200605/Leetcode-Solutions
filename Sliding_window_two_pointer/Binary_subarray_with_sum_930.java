package Sliding_window_two_pointer;
public class Binary_subarray_with_sum_930 {
        public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);
    }
    public int atMost(int[] nums,int goal){
        if(goal<0){
            return 0;
        }
        int l=0;
        int r=0;
        int sum=0;
        int count=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}
