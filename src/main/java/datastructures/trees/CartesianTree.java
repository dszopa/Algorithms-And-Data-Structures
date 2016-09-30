package datastructures.trees;

import datastructures.trees.config.Node;

/**
 * A binary tree that has the following properties:
 *  - It is heap-ordered
 *  - An in order traversal of it produces the original sequence of numbers
 *
 * This tree takes up O(n) space and can provide a smallest element between two indices in O(log(n)) time
 */
public class CartesianTree {

    private Node root;

    public CartesianTree(int[] data) {
        root = build(data);
    }

    public Node build(int[] data) {
        if (data == null || data.length == 0) {
            return null;
        }

        return build(data, 0, data.length -1);
    }

    private Node build(int[] data, int start, int end) {
        if (end < start) return null;

        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = start; i <= end; i++) {
            if (data[i] < min) {
                min = data[i];
                minIndex = i;
            }
        }

        Node node = new Node();
        node.value = min;
        node.left = build(data, start, minIndex -1);
        node.right = build(data, minIndex +1, end);
        return node;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
