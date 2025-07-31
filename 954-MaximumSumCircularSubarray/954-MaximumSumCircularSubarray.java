// Last updated: 7/31/2025, 2:12:16 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int linear_kadanes=kadanes(nums);
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		int[] negative_array=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			negative_array[i]=-nums[i];
		}
		int circular_kadanes=kadanes(negative_array);
		int new_sum=sum+circular_kadanes;
		if(new_sum==0) {
			return linear_kadanes;
		}
		else {
			return Math.max(linear_kadanes, new_sum);
		}
	}
	public static int kadanes(int[] arr) {
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;

	}
}