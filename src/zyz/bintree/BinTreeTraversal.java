package zyz.bintree;

import java.util.ArrayList;
import java.util.List;

public class BinTreeTraversal {

    private static class BinNode {
        private Object element;
        private BinNode leftChild;
        private BinNode rightChild;

        public BinNode(Object element, BinNode leftChild, BinNode rightChild) {
            this.element = element;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }

    /**
     * 前序遍历
     */
    public static void preOrder(BinNode binNode) {
        // 先将根节点存入list
        list.add(binNode);

        // 如果左子树不为空继续往左找，在递归调用方法的时候一直会将子树的根存入list，这就做到了先遍历根节点
        if (binNode.leftChild != null) {
            preOrder(binNode.leftChild);
        }

        // 无论走到哪一层，只要当前节点左子树为空，那么就可以在右子树上遍历，保证了根左右的遍历顺序
        if (binNode.rightChild != null) {
            preOrder(binNode.rightChild);
        }

    }

    private static BinNode root;
    private static List<BinNode> list = new ArrayList<>();

    public static void main(String[] args) {

        init();
        preOrder(root);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).element + " ");
        }
    }

    // 树的初始化:先从叶节点开始,由叶到根
    public static void init() {
        BinNode b = new BinNode("b", null, null);
        BinNode a = new BinNode("a", null, b);
        BinNode c = new BinNode("c", a, null);

        BinNode e = new BinNode("e", null, null);
        BinNode g = new BinNode("g", null, null);
        BinNode f = new BinNode("f", e, g);
        BinNode h = new BinNode("h", f, null);

        BinNode d = new BinNode("d", c, h);

        BinNode j = new BinNode("j", null, null);
        BinNode k = new BinNode("k", j, null);
        BinNode m = new BinNode("m", null, null);
        BinNode o = new BinNode("o", null, null);
        BinNode p = new BinNode("p", o, null);
        BinNode n = new BinNode("n", m, p);
        BinNode l = new BinNode("l", k, n);

        root = new BinNode("i", d, l);
    }
}
