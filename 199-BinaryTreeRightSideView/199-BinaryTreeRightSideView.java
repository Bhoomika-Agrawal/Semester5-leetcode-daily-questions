// Last updated: 7/31/2025, 2:14:23 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        right(root,1,ll);
        return ll;
    }
    int maxd=0;
    public void right(TreeNode root,int cl,List<Integer> ll){
        if(root==null){
            return;
        }
        if(maxd<cl){
            ll.add(root.val);
            maxd=cl;
        }
        right(root.right,cl+1,ll);
        right(root.left,cl+1,ll);
    }
}