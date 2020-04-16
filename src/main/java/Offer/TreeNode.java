package Offer;

public class TreeNode {
    private int value;//结点的值
    private TreeNode node;
    public TreeNode left;//左子节点
    public TreeNode right;//右子节点

    public TreeNode(int value) {
        this.value = value;
    }

    /**
     *getter and setter方法
     */

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getNode() {
        return node;
    }

    public void setNode(TreeNode node) {
        this.node = node;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
