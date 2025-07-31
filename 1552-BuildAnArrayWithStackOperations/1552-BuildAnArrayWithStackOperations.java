// Last updated: 7/31/2025, 2:11:33 PM
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int currentIndex = 0;
        int var=1;
        while(currentIndex <target.length && var<=n) {

            if (target[currentIndex] == var) {
                operations.add("Push");
                currentIndex++;
            } else {
                // Current element does not match the target
                operations.add("Push");
                operations.add("Pop");
            }
            var++;
        }

        return operations;
    }
}