package day;

import com.sun.source.util.Trees;

import java.util.TreeSet;

/**
 * @author xie
 * @description  94.二叉树的中序遍历
 * @date 2020/7/25 10:51
 */
public class InorderTarversal {
    public static void main(String[] args) {
        TreeSet<Integer> objects = new TreeSet<>();
         objects.add(1);
         objects.add(2);
         objects.add(3);
        Object[] objects1 = objects.toArray();
        objects.forEach(f-> System.out.println(f));

    }
}
