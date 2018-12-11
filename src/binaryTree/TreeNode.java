package binaryTree;

public class TreeNode {

    /**
     * 节点权
     */
    int value;
    /**
     * 左子节点
     */
    TreeNode leftNode;
    /**
     * 又子节点
     */
    TreeNode rightNode;


    /**
     *
     * @param value
     */
    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    /**
     * 前序遍历
     */
    public void frontShow(){
        System.out.println(value);
        if (leftNode != null){
            leftNode.frontShow();
        }
        if (rightNode != null){
            rightNode.frontShow();
        }
    }

    /**
     * 中序遍历
     */
    public void midShow(){
        if (leftNode != null){
            leftNode.frontShow();
        }
        System.out.println(value);
        if (rightNode != null){
            rightNode.frontShow();
        }
    }


    /**
     * 后续遍历
     */
    public void afterShow(){
        if (leftNode != null){
            leftNode.afterShow();
        }
        if (rightNode != null){
            rightNode.afterShow();
        }
        System.out.println(value);
    }

}
