package queue;

import java.util.Arrays;

public class MyQueue<T> {

    Object[] elements;

    MyQueue(){
        elements = new Object[0];
    }

    /**
     * 入队
     * @param o
     */
    public void add(T o){
        Object[] newArray = new Object[elements.length+1];
        for (int i =0;i<elements.length;i++){
            newArray[i] = elements[i];
        }
        newArray[elements.length] = o;
        elements = newArray;
    }

    /**
     * 出队
     * @return
     */
    public Object poll(){
        if (elements.length == 0){
            throw  new RuntimeException("queue is empty");
        }
        Object o = elements[0];
        Object[] newArray = new Object[elements.length-1];
        for (int i =0;i<newArray.length;i++){
            newArray[i] = elements[i+1];
        }
        elements = newArray;
        return o;
    }

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isEmpty(){
        return elements.length == 0;
    }

    public void show(){
        System.out.println(Arrays.toString(elements));
    }

}
