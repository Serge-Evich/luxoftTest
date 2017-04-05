package luxoft.binarytree;


public class BinaryTreeUtils {
    public static boolean treeEquals(BinaryTreeNode a, BinaryTreeNode b) {

        if (a == b) return true;
        if (a == null) return false;
        if (b == null) return false;

        if (a.getValue() != b.getValue()) {
            return false;
        }

        if (!treeEquals(a.getLeft(), b.getLeft())) {
            return false;
        }
        if (!treeEquals(a.getRight(), b.getRight())) {
            return false;
        }
        return true;
    }
}
