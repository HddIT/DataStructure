package linklist;

public class TestNode {


    public static void main(String[] args) {
        //单链表
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node0.append(node1);
        node1.append(node2);
        node2.append(node3);
        node0.show();
        node1.after(new Node(5));
        node0.show();
        node2.removeNext();
        node0.show();

    }

}
