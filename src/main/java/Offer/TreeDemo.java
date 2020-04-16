package Offer;

import java.util.Arrays;

public class TreeDemo {
    public static void main(String[] args) {
        //二叉树前中序遍历
        int[] pre = new int[]{1,2,4,7,3,5,6,8};
        int[] in = new int[]{4,7,2,1,5,3,8,6};
        System.out.print("前序： ");
        preOrderTraverse(reConstructBinaryTree(pre,in));
        System.out.println();
        System.out.print("中序： ");
         InOrderTraverse(reConstructBinaryTree(pre,in));
    }
    public static TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if(pre.length==0&&in.length==0){
            return null;
        }
        //前序遍历序列{1,2,4,7,3,5,6,8}       中序遍历序列{4,7,2,1,5,3,8,6}
        //由前序获得根节点
        TreeNode treeRoot = new TreeNode(pre[0]);
        //在通过中序遍历来分割左右子树
        for(int i = 0;i<in.length;i++){
            if(pre[0] == in[i]){
                //当找到中序遍历中根节点的位置时，开始进行子树递归的分割
                //递归的进行左右子树的根，左结点，右结点的分割
                //Arrays.copyOfRange(T[ ] original,int from,int to)
                //将一个原始的数组original，从下标from开始复制，复制到上标to，生成一个新的数组。
                //注意这里包括下标from，不包括上标to。
                //进行左子树的构建和分割
                treeRoot.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                //进行右子树的构建和分割
                treeRoot.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return treeRoot;
    }
    //前序遍历法,递归实现
    static void preOrderTraverse(TreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.getValue()+"->");
        preOrderTraverse(node.getLeft());
        preOrderTraverse(node.getRight());
    }
    //中序遍历，递归实现
    static void InOrderTraverse(TreeNode node){
        if(node==null){
            return;
        }
        InOrderTraverse(node.getLeft());
        System.out.print(node.getValue()+"->");
        InOrderTraverse(node.getRight());
    }
    //后序遍历
    static void PostOrderTraver(TreeNode node){
        if(node == null){
            return;
        }
        PostOrderTraver(node.getLeft());
        PostOrderTraver(node.getRight());
        System.out.print(node.getValue()+"->");
    }
}

