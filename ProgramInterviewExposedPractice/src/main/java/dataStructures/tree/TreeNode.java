package dataStructures.tree;

public class TreeNode<T> {
    private TreeNode<T>[] children;
    private T value;

    public TreeNode(TreeNode<T>[] children, T value) {
        this.children = children;
        this.value = value;
    }

    public int getNumChildren() {
        return children.length;
    }

    public TreeNode<T> getChildWithIndex(int index) {
        return children[index];
    }

    public TreeNode<T>[] getChildren() {
        return children;
    }

    public T getValue() {
        return value;
    }
}
