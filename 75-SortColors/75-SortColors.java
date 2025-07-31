// Last updated: 7/31/2025, 2:15:24 PM
class Solution {
    public void sortColors(int[] nums) {
        sort(nums);
    }
    public static void sort(int[] arr){
		for(int turn=1;turn<arr.length;turn++) {
			for(int i=0;i<arr.length-turn;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
    }
}