// Last updated: 7/31/2025, 2:13:36 PM
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=1;
        int end=n;
        while(start<=end){
            int mid=end+((start-end)/2);
            int result=guess(mid);
            if(result==0){
                return mid;
            }
            else if(result==1){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}