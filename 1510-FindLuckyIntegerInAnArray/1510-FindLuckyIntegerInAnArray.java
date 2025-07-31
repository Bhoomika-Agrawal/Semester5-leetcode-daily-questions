// Last updated: 7/31/2025, 2:11:40 PM
class Solution {
    public int findLucky(int[] arr) {
        int[] output = new int[501];
        for( int value : arr ){
            output[value] += 1;
        }
        for( int i = 500; i > 0; i-- ){
            if( output[i] == i ){
                return i;
            }
        }
        return -1;
    }
}