package com.wangb.arith.tree.template.tree;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    /**
     * 迭代广度优先二叉树遍历
     *
     * @param root 树跟节点
     * @return 节点值列表
     */
    public List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> valList = new ArrayList<>();
        if (root == null) {
            return valList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> tmpList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode tmpNode = queue.poll();
                tmpList.add(tmpNode.val);

                if (tmpNode.left != null) {
                    queue.add(tmpNode.left);
                }
                if (tmpNode.right != null) {
                    queue.add(tmpNode.right);
                }
            }
            valList.add(tmpList);
        }
        return valList;
    }

}
