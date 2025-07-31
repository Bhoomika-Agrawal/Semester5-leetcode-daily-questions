// Last updated: 7/31/2025, 2:13:21 PM
class Solution {
    public int countSegments(String s) {
        if(s.trim().isEmpty()){
            return 0;
        }
        String[] segments=s.trim().split("\s+");
        return segments.length;
    }
}