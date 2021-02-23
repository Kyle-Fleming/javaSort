public class TestMyFilmQueue {
    public static void main(String[] args) {
        QueueAsMyLinkedList<String> que = new QueueAsMyLinkedList<String>();
        QueueAsMyLinkedList<String> que2 = new QueueAsMyLinkedList<String>();

        
        que.enqueue(String.valueOf("Rocky"));
        que.enqueue(String.valueOf("Jaws"));
        que.enqueue(String.valueOf("Batman"));
        que.enqueue(String.valueOf("Casino"));

        System.out.printf("Initial queue: %s\n\n", que);

        que2 = que.reverseOrder(que);
        System.out.printf("Queue after reversing: %s\n\n", que2);

        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.dequeue();
        
        System.out.println("Case 1: empty parameter queue");
        System.out.printf("Queue: %s\n\n", que);

        
        

    }
}
