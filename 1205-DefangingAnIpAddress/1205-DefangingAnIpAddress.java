// Last updated: 7/31/2025, 2:11:57 PM
class Solution {
    public String defangIPaddr(String address) {
        String str=address.replace(".","[.]");
        return str;
    }
}