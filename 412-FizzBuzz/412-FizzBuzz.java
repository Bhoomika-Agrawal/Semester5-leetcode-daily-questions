// Last updated: 7/31/2025, 2:13:26 PM
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ll=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                ll.add("FizzBuzz");
            }
            else if(i%3==0){
                ll.add("Fizz");
            }
            else if(i%5==0){
                ll.add("Buzz");
            }
            else{
                ll.add(String.valueOf(i));
            }
        }
        return ll;
    }
}