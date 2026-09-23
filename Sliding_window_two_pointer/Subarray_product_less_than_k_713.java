package Sliding_window_two_pointer;

public class Subarray_product_less_than_k_713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;
        int right=0;
        int n=nums.length;
        int product=1;
        int count=0;
        if(k<=1){
            return 0;
        }

        while(right<n){
            product*=nums[right];
            
            while(product>=k){
                product/=nums[left];
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
}
