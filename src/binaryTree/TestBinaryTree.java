package binaryTree;

public class TestBinaryTree {


    /**
     * 创建二叉树
     * @param args
     */
    public static void main(String[] args) {
        //创建一颗树
        BinaryTree binaryTree = new BinaryTree();
        //创建根节点
        TreeNode root = new TreeNode(1);
        //设置根节点
        binaryTree.setRoot(root);
        //创建左子节点
        TreeNode rootL = new TreeNode(2);
        root.setLeftNode(rootL);
        //创建右子节点
        TreeNode rootR = new TreeNode(3);
        root.setRightNode(rootR);
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
        binaryTree.frontShow();
        System.out.println("=============");
        binaryTree.midShow();
        System.out.println("=============");
        binaryTree.afterShow();
    }

}
