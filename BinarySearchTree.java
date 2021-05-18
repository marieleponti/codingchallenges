public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {

    TreeNode<AnyType> root;

    // Constructor BinarySearchTree
    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(TreeNode<AnyType> node) {
        root = node;
    }

    // public method isEmpty
    public boolean isEmpty() {
        return root == null;
    }

    public void insert(AnyType x){
        root = insert(x, root);
    }

    private TreeNode<AnyType> insert(AnyType x, TreeNode<AnyType> t) {
        if (t == null) return new TreeNode(x);
        int compare = x.compareTo(t.data);
        if (compare <= 0) {
            if (t.left == null) {
                t.left = new TreeNode(x);
            } else {
                insert(x, t.left);
            }
        } else if (compare > 0) {
            if (t.right == null) {
                t.right = new TreeNode(x);
            } else {
                insert(x, t.right);
            }
        }
        return t;
    }
}