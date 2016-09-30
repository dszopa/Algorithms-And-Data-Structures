package datastructures.trees.runners;

import algorithms.treeTraversals.Traversals;
import datastructures.trees.CartesianTree;

public class CartesianTreeRunner {

    public static void main(String[] args) {
        int[] array = {5, 10, 40, 30, 28};
        CartesianTree cartesianTree = new CartesianTree(array);

        System.out.println("Inorder Traversal: ");
        Traversals.inorderTraversal(cartesianTree.getRoot());
        System.out.println("\n");

        System.out.println("Level Order Traversal: ");
        Traversals.levelOrderTraversal(cartesianTree.getRoot());
    }
}
