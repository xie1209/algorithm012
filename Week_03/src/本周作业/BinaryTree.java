package 本周作业;

/**
 * @author xie
 * @description  简单的用来测试的二叉树
 * @date 2020/7/26 13:55
 */
public class BinaryTree {
    TreeNode root;
    //构建二叉树 通过递归来构建
    public TreeNode addRecursive(TreeNode cur,int value){
        if(cur==null) {
            return new TreeNode(value);
        }
        if(value<cur.val){
            cur.left=addRecursive(cur.left,value);
        }else if(value>cur.val){
            cur.right=addRecursive(cur.right,value);
        }else {
            return cur;
        }
        return cur;
    }
    //通过递归方法创建根节点
    public  void add(int value){
        root=addRecursive(root,value);
    }

    //创建一个遍历数组的递归方法
    public boolean containsNodeRecursive(TreeNode cur,int value){
        if(cur == null) return false;
        if(cur.val==value) return true;
        return value<cur.val ? containsNodeRecursive(cur.left,value):containsNodeRecursive(cur.right,value);
    }
    public boolean containsNode(int value){
        return containsNodeRecursive(root,value);
    }

    //删除节点 有三种情况 1.节点是叶子节点   2.节点只有一个子节点  3.节点有两个子节点
    public TreeNode deleteRecursive(TreeNode cur,int value){
        //递归终止条件
        if(cur == null) return null;
        //找到目标节点后 删除有三种情况
        //递归中的逻辑(最难)
        if(cur.val==value){  //该语句块只会在找到目标节点层实现 所有可以cur.val=lastedValue;
            //1.当前节点是叶子节点
             if(cur.left==null && cur.right==null){
                 return null; //返回给递归的上一次，即当前层的父节点(返回值被赋值给父节点的左子节点或右子节点)
             }
             // 2.只有一个节点
            if(cur.left==null) return cur.right;
            if(cur.right==null) return cur.left;

            //3.有两节点 找到最近value
            int lastedValue=findLastedValue(cur.right);
            cur.val=lastedValue;
            cur.right=deleteRecursive(cur.right,lastedValue); //进入右子节点，将最近的值删除
            return cur;  //返回给父节点的左子节点或右子节点作为引用
        }
        if(value<cur.val){
            cur.left=deleteRecursive(cur.left,value); //进入递归
            return cur; //
        }
        cur.right=deleteRecursive(cur.right,value);
        return cur;
        //进入下一层
        //清除当前层

    }

    private int findLastedValue(TreeNode right) {
        //如果是叶子节点，返回value  否则继续递归到叶子节点
        return right.left==null ? right.val:findLastedValue(right.left);
    }


}
