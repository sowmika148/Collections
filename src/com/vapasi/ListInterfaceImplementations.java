package com.vapasi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

class ListInterfaceImplementations {

    void execute() {
        arrayListExample();
        linkedListExample();
        vectorExample();
        stackExample();
    }

    private void arrayListExample() {
        // Adding object in arrayList
        // Maintains insertion order
        // Can be randomly accessed
        List<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        iterateList(list);
    }

    private void linkedListExample() {
        // Adding object in linked list
        // Maintains insertion order
        // Manipulation is fast because no shifting is required
        List<String> list = new LinkedList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        iterateList(list);
    }
    private void vectorExample() {
        // Adding object in vector
        // Similar to ArrayList
        // Contains many methods
        List<String> list = new Vector<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        iterateList(list);
    }
    private void stackExample() {
        // Adding object in stack
        // Subclass of Vector
        Stack<String> stack = new Stack<>();
        stack.push("Ravi");
        stack.push("Vijay");
        stack.push("Ajay");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();

        iterateList(stack);
    }

    private void iterateList(List<String> list) {
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
