// Last updated: 7/31/2025, 2:14:35 PM
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1=version1.split("\\.");
        String[] s2=version2.split("\\.");
        int n1=s1.length;
        int n2=s2.length;
        int i=0,j=0;
        while(i<n1 || j<n2){
            int num1=(i<n1) ? Integer.parseInt(s1[i]) :0;
            int num2=(j<n2) ? Integer.parseInt(s2[j]) :0;
            if(num1!=num2){
                return (num1>num2)?1:-1;
            }
            i++;
            j++;
        }
        return 0;
    }
}