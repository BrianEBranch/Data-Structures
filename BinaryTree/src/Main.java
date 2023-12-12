public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bstNumbers = new BinarySearchTree<>();
        int[] numbers = {41, 50, 24, 37, 13, 84, 27, 34};
        for(int i = 0 ; i < numbers.length; i++){
            bstNumbers.insert(numbers[i]);
        }
//        bstNumbers.postOrderTraversal();
//        bstNumbers.inOrderTraversal();
//        bstNumbers.preOrderTraversal();
    }
}