public class Test {
    public static void main(String[] args) {
        TestBinaryTree testBinaryTree = new TestBinaryTree();
        testBinaryTree.insert(2);
        testBinaryTree.insert(8);
        testBinaryTree.insert(15);
        testBinaryTree.insert(21);
        testBinaryTree.insert(35);
        testBinaryTree.insert(7);

        testBinaryTree.inorder(testBinaryTree.root);
        System.out.println();
        testBinaryTree.preOrder(testBinaryTree.root);

        testBinaryTree.remove(10);
        System.out.println("====================");
        testBinaryTree.inorder(testBinaryTree.root);
        System.out.println();
        testBinaryTree.preOrder(testBinaryTree.root);
    }
}
