// Last updated: 7/31/2025, 2:12:05 PM
class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return (a);
    }
}