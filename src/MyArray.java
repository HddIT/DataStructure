
import java.lang.annotation.ElementType;
import java.util.Arrays;

public class MyArray<T> {

    private Object[] elements;

    public MyArray() {
        elements = new Object[0];
    }

    /**
     * 数组大小
     * @return
     */
    public int size(){
        return elements.length;
    }

    /**
     * 添加元素
     * @param o
     */
    public void add(T o){
        Object[] newArr = new Object[elements.length+1];
        for (int i = 0;i<elements.length;i++){
            newArr[i] = elements[i];
        }
        newArr[elements.length] = o;
        elements = newArr;
    }

    /**
     * 根据下标删除元素
     * @param index
     */
    public void delete(int index){
        if (index < 0 || index > elements.length-1){
            throw new IndexOutOfBoundsException("下标越界");
        }
        Object[] newArr = new Object[elements.length-1];
        for (int i =0;i<newArr.length;i++){
            if (i < index){
                newArr[i] = elements[i];
            } else {
                newArr[i] = elements[i+1];
            }
        }
        elements = newArr;

    }

    /**
     * 根据坐标获取元素
     * @param index
     * @return
     */
    public Object get(int index){
        if (index < 0 || index > elements.length-1){
            throw new IndexOutOfBoundsException("下标越界");
        }
        return elements[index];
    }

    /**
     * 根据下标插入元素
     * @param index 下标
     * @param o 元素
     */
    public void insert(int index,T o){
        if (index < 0 || index > elements.length-1){
            throw new IndexOutOfBoundsException("下标越界");
        }
        Object[] newArr = new Object[elements.length+1];
        for (int i =0;i<elements.length;i++){
            if (i<index){
                newArr[i] = elements[i];
            }else {
                newArr[i+1] = elements[i];
            }
        }
        newArr[index] = o;
        elements = newArr;
    }

    public void show(){
        System.out.println(Arrays.toString(elements));
    }

    public int search(T o){
        int index = -1;
        for (int i = 0;i <elements.length;i++ ){
            if (elements[i] == o || elements[i].equals(o))
            {
                index = i;
                return index;
            }
        }
        return index;
    }

    /**
     * 二分查找
     * @param o
     * @return
     */
    public int binarySearch(T o){
        int index = -1;
        int begin = 0;
        int end = elements.length-1;
        int mid = (begin + end)/2;
        while (true){
            if (begin > end){
                return index;
            }
            if (elements[mid] == o || elements[mid].equals(o)){
                index = mid;
                return index;
            }else {
                if (elements[mid] instanceof Integer){
                    if (Integer.parseInt(elements[mid].toString()) > Integer.parseInt(o.toString())){
                        end = mid-1;
                    }else {
                        begin = mid+1;
                    }
                }
            }
            mid = (begin + end)/2;
        }
    }

}
