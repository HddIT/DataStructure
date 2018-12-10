import java.util.ArrayList;
import java.util.Arrays;

public class TestArray {

    public static void main(String[] args) {
        add();
        delete(0);
        testMyArray();

    }

    /**
     * 删除元素
     * @param index  元素下标
     */
    private static void delete(int index) {
        System.out.println("=======删除元素=======");
        int[] arr = new int[]{9,8,7,6,5,4};
        System.out.println(Arrays.toString(arr));
        int[] newArray = new int[arr.length-1];
        for (int i = 0;i<newArray.length;i++){
            if (i < index){
                newArray[i] = arr[i];
            }else {
                newArray[i] = arr[i+1];
            }
        }
        arr = newArray;
        System.out.println(Arrays.toString(arr));

    }

    /**
     * //数组添加元素
     */
    public static void add(){
        System.out.println("=======添加元素=======");
        int dst = 6;
        int[] arr = new int[]{9,8,7};
        System.out.println(Arrays.toString(arr));
        int[] newArr = new int[arr.length+1];
        for (int i =0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = dst;
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }

    static void testMyArray(){
        System.out.println("====二分查找====");
        MyArray<Integer> array = new MyArray<>();
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.add(11);
        array.add(12);
        array.show();
        int index = array.binarySearch(5);
        System.out.println(array.size());
        System.out.println("index:"+index);
    }
}
