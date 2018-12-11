package binaryTree;

public class BinaryTree {

    TreeNode root;


    /**
     * 获取根节点
     * @return
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * 设置根节点
     * @param root
     */
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void frontShow(){
        root.frontShow();
    }

    public void midShow(){
        root.midShow();
    }

    public void afterShow(){
        root.afterShow();
    }
}
