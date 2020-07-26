package 本周作业;

/**
 * @author xie
 * @description  236.二叉树的最近公共祖先
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * @date 2020/7/26 11:33
 */
public class CommonAnstor {
    //思路一  采用递归 递归结束向上返回的四种情况 1.左右子节点均为空，说明没有找到 返回null  2.左右子节点均不为空，说明父节点为最近公共祖先，返回父节点
    // 3.左子节点为null，右子节点不为null 返回右节点  4.右子节点为null，返回左子节点
    // 最后在根节点处判断，
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //递归终止条件 root代表的是当前节点
        if(root==null || root==p || root==q) return root;
        //当前层逻辑
        //进入下一层
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        //处理当前层,向上一层返回的逻辑
        if(left==null && right==null) return null;
        if(left==null) return right;
        if(right==null) return left;
        return root;
    }
}
