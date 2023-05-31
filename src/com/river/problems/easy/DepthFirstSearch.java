package com.river.problems.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    public static void main(String[] args) {

    }
}

class Node {
    String name;
    List<Node> children = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }

    public List<String> depthFirstSearch(List<String> array) {
        Stack<Node> stack = new Stack<>();
        array.add(this.name);
        if (this.children != null && !this.children.isEmpty()) {
            for (int i = this.children.size() - 1; i >= 0; i--) {
                stack.add(this.children.get(i));
            }
        }

        while (!stack.isEmpty()) {
            Node child = stack.pop();
            array.add(child.name);
            if (child.children != null && !child.children.isEmpty()) {
                for (int i = child.children.size() - 1; i >= 0; i--) {
                    stack.add(child.children.get(i));
                }
            }
        }
        return array;
    }

    public List<String> depthFirstSearchRecursive(List<String> array) {
        dfs(this, array);
        return array;
    }

    private void dfs(Node node, List<String> array) {
        array.add(node.name);
        if (node.children != null && !node.children.isEmpty()) {
            node.children.forEach(c -> dfs(c, array));
        }
    }

    public Node addChild(String name) {
        Node child = new Node(name);
        children.add(child);
        return this;
    }
}
