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
    public TreeNode build(int[]preorder,int start,int end){

        if(start>end){
            return null;
        }

        TreeNode root=new TreeNode(preorder[start]);

        int i;
        for(i=start+1;i<=end;i++){
            if(preorder[i]>root.val){  //split of right subtree i.e it shows right subtree start from here
                break;
            }
        }
        //left subtree
        root.left=build(preorder,start+1,i-1);

        //right subtree
        root.right=build(preorder,i,end);


        return root;
        
    }
    public TreeNode bstFromPreorder(int[] preorder) {

        return build(preorder,0,preorder.length-1);




        
    }
}