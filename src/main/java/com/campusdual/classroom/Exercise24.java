package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Smith");
        queue.add("Montessori");
        queue.add("Peralta");
        queue.add("House");
        return queue;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        System.out.println("Elemento en la cima de la cola: " + queue.peek());
        while (!queue.isEmpty()) {
            System.out.println("Elemento eliminado: " + queue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = createQueue();
        printAndEmptyQueue(queue);
    }

}
