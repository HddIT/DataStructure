import java.time.chrono.MinguoChronology;

public class TestSearchArithmetic {

    public static void main(String[] args) {
       erFen();
    }

    /**
     * 线性查找
     */
    public static void lineSearch(){
        int[] arr = new int[]{8,7,5,4,3,6,9,1,2,0};
        int tager = 6;
        int index = -1;
        for (int i =0;i<arr.length;i++){
            if (arr[i] == tager){
                index = i;
                break;
            }
        }
        System.out.println("index==: " +index);
    }

    /**
     * 二分法查找
     */
    public static void erFen(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int tager = 8;
        int begin = 0;
        int end = arr.length-1;
        int mid = (begin + end)/2;
        int index = -1;
        while (true){
            if (arr[mid] == tager){
                index = mid;
                break;
            }else {
                if (arr[mid] > tager){
                    end = mid - 1;
                }else {
                    begin = mid + 1;
                }
            }
            mid = (begin + end)/2;
        }
        System.out.println("index == : " +index);
    }

}
