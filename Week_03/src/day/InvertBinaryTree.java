package day;


/**
 * @author xie
 * @description  226.翻转二叉树    翻转一颗二叉树
 * @date 2020/7/22 9:20
 */
public class InvertBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

        public TreeNode invertTree(TreeNode root) {

           return root;
        }

        public static class TreeNode{
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x){ val=x;}
        }

}
