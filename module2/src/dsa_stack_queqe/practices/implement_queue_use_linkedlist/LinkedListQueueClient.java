package dsa_stack_queqe.practices.implement_queue_use_linkedlist;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);

        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
