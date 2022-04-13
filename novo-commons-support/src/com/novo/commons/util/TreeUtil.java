package com.novo.commons.util;

import com.novo.framework.core.exception.CustomException;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by   aoheng on 2020/6/12.
 */
public class TreeUtil {
    /**
     * 两层循环实现建树
     * @param treeNodes 传入的树节点列表
     * @return
     */
    public static <T extends TreeNode> List<T> bulid(List<T> treeNodes, Object root) {

        List<T> trees = new ArrayList<T>();

    /*TreeNode rootNode = null;
    for (T treeNode : treeNodes) {
    	if (root.equals(treeNode.getId())) {
    		rootNode = treeNode;
         }
    }*/

        for (T treeNode : treeNodes) {
            if (treeNode.getParentId().toString().equals("-1")) {
                System.out.println(treeNode.getId());
            }
            if (root.toString().equals(treeNode.getParentId().toString())) {
                treeNode.setChildren(getChildren(treeNodes, treeNode));
                trees.add(treeNode);
            }

            //      for (T it : treeNodes) {
            //        if (it.getParentId() == treeNode.getId()) {
            //          if (treeNode.getChildren() == null) {
            //            treeNode.setChildren(new ArrayList<TreeNode>());
            //          }
            //          treeNode.add(it);
            //        }
            //      }
        }
        return trees;
    }

    public static <T extends TreeNode> List<T> getChildren(List<T> treeNodes, T parent) {
        List<T> children = new ArrayList<T>();
        for (T child : treeNodes) {
            if (child.getParentId() == null) {
                throw new CustomException("error001", "parent id not is null");
            }
            if (child.getParentId() - parent.getId() == 0) {
                child.setChildren(getChildren(treeNodes, child));
                children.add(child);
            }
            if(parent.getCode()!=null){
                if(child.getParentId() - parent.getCode() == 0){
                    child.setChildren(getChildren(treeNodes, child));
                    children.add(child);
                }
            }

        }
        return children;
    }

    /**
     * 使用递归方法建树
     * @param treeNodes
     * @return
     */
    public static <T extends TreeNode> List<T> buildByRecursive(List<T> treeNodes, Object root) {
        List<T> trees = new ArrayList<T>();
        for (T treeNode : treeNodes) {
            if (root.equals(treeNode.getParentId())) {
                trees.add(findChildren(treeNode, treeNodes));
            }
        }
        return trees;
    }

    /**
     * 递归查找子节点
     * @param treeNodes
     * @return
     */
    public static <T extends TreeNode> T findChildren(T treeNode, List<T> treeNodes) {
        for (T it : treeNodes) {
            if (treeNode.getId() == it.getParentId() || treeNode.getCode() == it.getParentId()) {
                if (treeNode.getChildren() == null) {
                    treeNode.setChildren(new ArrayList<TreeNode>());
                }
                treeNode.add(findChildren(it, treeNodes));
            }
        }
        return treeNode;
    }

}
