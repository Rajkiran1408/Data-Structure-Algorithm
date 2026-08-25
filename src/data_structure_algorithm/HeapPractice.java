package src.data_structure_algorithm;

import java.util.ArrayList;

public class HeapPractice {
    ArrayList<Integer>  heap ;

    public HeapPractice(){
        heap = new ArrayList<>();
    }

    //get the minimum element

    public void peek(){
        if(heap.isEmpty()){
            return;
        }
        System.out.println(heap.getFirst());
    }

    //operation poll

    public int poll(){

        int min = heap.getFirst();
        int lastValue= heap.remove(heap.size()-1);
        if(!heap.isEmpty()){
            heap.set(0,lastValue);
            heapifyDown();
        }
        return min;
    }

    //Order and arrange minheap

    public void heapifyDown(){
        int size = heap.size()-1;
        int current=0;

        while (true){
            int left = 2*current +1;
            int right = 2*current +2;
            int smallest = current;

            if(left<=size && heap.get(left) < heap.get(smallest)){
                smallest=left;
            }
            if(right<=size && heap.get(right) < heap.get(smallest)){
                smallest=right;
            }
            if(smallest!=current){
                swap(smallest,current);
                current=smallest;
            }
            else {
                break;
            }
        }

    }

    //Insert a minHeap
    public void insert(int val){
        heap.add(val);                 // store value in ArrayList
        int current = heap.size()-1;   // find current inserted value index

        while (current > 0){
            int parent = (current - 1) / 2;          // find insert value's index of parent index
            if(heap.get(current) < heap.get(parent)){    // if the parent value is greater than insert value , swap it
                swap(current,parent);
                current = parent;
            }
            else {
                break;                          // Otherwise leave the loop
            }
        }
    }

    public void swap(int i,int j){                 // swap the value
        int temp = heap.get(i);
        heap.set(i,heap.get(j));
        heap.set(j,temp);
    }
    static void main(String[] args) {
        HeapPractice hp = new HeapPractice();
        hp.insert(5);
        hp.insert(6);
        hp.insert(4);
        hp.insert(2);
        hp.insert(7);

        hp.peek();
        System.out.println(hp.poll());
        System.out.println(hp.heap);

    }
}
