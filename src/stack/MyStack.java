package stack;

public class MyStack<T> {


    Object[] elements;

    MyStack(){
        elements = new Object[0];
    }

    /**
     * 进栈
     * @param element
     */
    public void push(T element){
        Object[] newArray = new Object[elements.length+1];
        for (int i= 0;i<elements.length;i++){
            newArray[i] = elements[i];
        }
        newArray[elements.length] = element;
        elements = newArray;
    }

    /**
     * 出栈
     * @return
     */
    public Object pop(){
        if (elements.length == 0){
            throw new RuntimeException("stack is empty");
        }
        Object o = elements[elements.length-1];
        Object[] newArray = new Object[elements.length-1];
        for (int i=0;i<elements.length-1;i++){
            newArray[i] = elements[i];
        }
        elements = newArray;
        return o;
    }

    /**
     * 查看栈顶元素
     * @return
     */
    public Object peek(){
        if (elements.length == 0){
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length-1];
    }

    /**
     * 查看栈元素是否为空
     * @return
     */
    public boolean isEmpty(){
        return elements.length == 0;
    }

}
