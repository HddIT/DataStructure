package linklist;

public class Node {

    Object data;
    Node next;

    public Node(Object data){
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public Object getData() {
        return data;
    }

    /**
     * 追加节点
     * @param node
     * @return
     */
    public Node append(Node node){
        Node currentNode = this;
        while (true){
            Node nextNode = currentNode.next;
            if (nextNode == null){
                currentNode.next = node;
                break;
            }
            currentNode = nextNode;
        }
        return currentNode;
    }

    /**
     * 插入一个节点
     * @param node
     */
    public void after(Node node){
        Node creentNode = this;
        Node nextNext = creentNode.next;
        creentNode.next = node;
        node.next = nextNext;
    }

    /**
     * 删除下一个节点
     */
    public void  removeNext(){
        Node creentNode = this;
        creentNode.next = creentNode.next.next;
    }

    public void  show(){
        Node creentNode = this;
        while (true){
            System.out.print(" "+creentNode.getData());
            creentNode = creentNode.next;
            if (creentNode == null)
                break;
        }
        System.out.println();
    }
}
