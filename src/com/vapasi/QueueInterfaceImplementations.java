package com.vapasi;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

class QueueInterfaceImplementations<T> {

    void execute() {
        priorityQueueExample();
        // Add or remove an element from both the sides of the queue
        arrayDeQueueExample();
    }

    private void arrayDeQueueExample() {
        // Implements Dequeue
        Deque<Integer> queue = new ArrayDeque<>();

        // add() method to insert
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        // clear() method
        queue.clear();

        // addFirst() method to insert at start
        queue.addFirst(564);
        queue.addFirst(291);

        // addLast() method to insert at end
        queue.addLast(24);
        queue.addLast(14);

        iterateQueue((Queue<T>) queue);

        // descendingIterator() : to reverse the deque order
        System.out.println("Elements of deque in reverse order :");
        for (Iterator dItr = queue.descendingIterator(); dItr.hasNext(); ) {
            System.out.println(dItr.next());
        }
    }

    private void priorityQueueExample() {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("C++");
        queue.add("Java");
        queue.add("Python");

        // Printing the most priority element
        System.out.println("Head value using peek function:"
                + queue.peek());

        // Removing the top priority element (or head) and
        // printing the modified queue using poll()
        queue.poll();
        System.out.println("After removing an element with poll function:");
        iterateQueue((Queue<T>) queue);

        // Removing Java using remove()
        queue.remove("Java");

        // Check if an element is present using contains()
        System.out.println("Priority queue contains C " +
                "or not?: " + queue.contains("C"));
    }

    // Generics: To accept String and Integer in this case
    private void iterateQueue(Queue<T> queue) {
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
