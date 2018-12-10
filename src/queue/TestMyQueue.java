package queue;

public class TestMyQueue {

    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        queue.add("队列1");
        queue.add("队列2");
        queue.add("队列3");
        queue.add("队列4");
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue.isEmpty());
        //出队
        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());
        //查看队列
        queue.show();
    }

}
