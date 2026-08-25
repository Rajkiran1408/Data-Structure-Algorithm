package src.data_structure_algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapCollection {
    static void main(String[] args) {
        // min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(15);   // add value in heap
        minHeap.add(10);

        minHeap.add(20);

        System.out.println(minHeap.poll());   // delete and the return
        System.out.println(minHeap.peek());   // return val

        // max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeap.add(15);
        maxHeap.add(10);

        maxHeap.add(20);

        System.out.println(maxHeap.poll());   // delete and the return
        System.out.println(maxHeap.peek());   // return val
    }
}
