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
    public boolean isCousins(TreeNode root, int x, int y) {

        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();

            TreeNode parentX=null;
            TreeNode parentY=null;

            for(int i=0;i<size;i++){

                TreeNode curr=q.remove();

                if(curr.left!=null){
                    if(curr.left.val==x) parentX=curr;
                    if(curr.left.val==y) parentY=curr;
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    if(curr.right.val==x) parentX=curr;
                    if(curr.right.val==y) parentY=curr;
                    q.add(curr.right);
                }

            }
            if(parentX!=null && parentY!=null){
                return parentX!=null && parentY!=null && parentX!=parentY;
            }
            
        }
        return false;
        
    }
}