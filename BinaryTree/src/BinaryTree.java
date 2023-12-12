public class BinaryTree<T> {
    protected static class Node<T>{
        //Node data
        protected T data;
        //Left child
        protected Node<T> left;
        //right Child
        protected Node<T> right;
        protected Node(T data){
            this.data = data;
            left = null;
            right = null;
        }
        @Override
        public String toString(){
            return data.toString();
        }
    }
    protected Node<T> root;
    public BinaryTree(){
        root = null;
    }

    public BinaryTree(T data){
        root = new Node<>(data);
    }
    protected BinaryTree(Node<T> root){
        this.root = root;
    }

    public BinaryTree(T data, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
        root = new Node<>(data);
        if(leftTree != null){
            root.left = leftTree.root;
        }
        if(rightTree != null){
            root.right = rightTree.root;
        }
    }
    public BinaryTree<T> getLeftSubtree(){
        if(root != null && root.left != null){
            return new BinaryTree<T>(root.left);
        }
        return null;
    }
    public BinaryTree<T> getRightSubtree(){
        if(root != null && root.right != null){
            return new BinaryTree<T>(root.right);
        }
        return null;
    }
    public T getData(){
        if(root != null){
            return root.data;
        }
        return null;
    }
    public boolean isLeaf(){
        return (root == null || (root.left == null && root.right == null));
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        preOrderTraverse(root, 1, sb);
        return sb.toString();
    }
    //public wrappers
    public void preOrderTraversal() {
        StringBuilder sb = new StringBuilder();
        preOrderTraverse(root, 0, sb);
        System.out.println(sb.toString());
    }

    public void inOrderTraversal() {
        StringBuilder sb = new StringBuilder();
        inOrderTraverse(root, 0, sb);
        System.out.println(sb.toString());
    }

    public void postOrderTraversal() {
        StringBuilder sb = new StringBuilder();
        postOrderTraverse(root, 0, sb);
        System.out.println(sb.toString());
    }
    private void preOrderTraverse(Node<T> node, int depth, StringBuilder sb){
        for(int i = 1; i < depth; i++){
            sb.append(" ");
        }
        if(node == null){
            sb.append("null (Pre-order)\n");
            return;
        }
        sb.append(node);
        sb.append(" (Pre-order)\n");
        preOrderTraverse(node.left, depth + 1, sb);
        preOrderTraverse(node.right, depth + 1, sb);
    }
    private void inOrderTraverse(Node<T> node, int depth, StringBuilder sb){
        for(int i = 1; i < depth; i++){
            sb.append(" ");
        }
        if(node != null){
            inOrderTraverse(node.left, depth + 1, sb);
            sb.append(node);
            sb.append(" (In-order)\n");
            inOrderTraverse(node.right, depth + 1, sb);
        }
        sb.append("null (In-order)\n");
        return;
    }
    private void postOrderTraverse(Node<T> node, int depth, StringBuilder sb) {
        for (int i = 1; i < depth; i++) {
            sb.append(" ");
        }
        if (node != null) {
            postOrderTraverse(node.left, depth + 1, sb);
            postOrderTraverse(node.right, depth + 1, sb);
            sb.append(node);
            sb.append(" (Post-order)\n");
        }
        sb.append("null (Post-order)\n");
        return;
    }
}
