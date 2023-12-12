import java.util.ArrayList;
import java.util.List;
public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {

    public BinarySearchTree() {
        super();
    }

    public BinarySearchTree(T data) {
        super(data);
    }

    private BinarySearchTree(Node<T> root) {
        super(root);
    }

    public boolean contains(T target) {
        return contains(target, root);
    }

    private boolean contains(T target, Node<T> node) {
        if (node == null) {
            return false;
        }

        int compareResult = target.compareTo(node.data);

        if (compareResult < 0) {
            return contains(target, node.left);
        } else if (compareResult > 0) {
            return contains(target, node.right);
        } else {
            return true; // Found
        }
    }

    public void insert(T data) {
        root = insert(data, root);
    }

    private Node<T> insert(T data, Node<T> node) {
        if (node == null) {
            return new Node<>(data);
        }

        int compareResult = data.compareTo(node.data);

        if (compareResult < 0) {
            node.left = insert(data, node.left);
        } else if (compareResult > 0) {
            node.right = insert(data, node.right);
        } else {
            // Duplicate data, do nothing
        }

        return node;
    }

    public void delete(T data) {
        root = delete(data, root);
    }

    private Node<T> delete(T data, Node<T> node) {
        if (node == null) {
            return null;
        }

        int compareResult = data.compareTo(node.data);

        if (compareResult < 0) {
            node.left = delete(data, node.left);
        } else if (compareResult > 0) {
            node.right = delete(data, node.right);
        } else {
            // Node to be deleted found

            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            node.data = findMin(node.right).data;
            node.right = delete(node.data, node.right);
        }

        return node;
    }

    private Node<T> findMin(Node<T> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public boolean isValidBST() {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(Node<T> node, T min, T max) {
        if (node == null) {
            return true;
        }

        if ((min != null && node.data.compareTo(min) <= 0) || (max != null && node.data.compareTo(max) >= 0)) {
            return false;
        }

        return isValidBST(node.left, min, node.data) && isValidBST(node.right, node.data, max);
    }
}
