package recursion;

public class TestRecursion {

    public static void main(String[] args) {

        /**
         * 斐波那契数列：1 1 2 3 5 8 13 21 34 55 89
         * 前两个阿拉伯数字为1，第三项则为前两项之和，以此类推。
         */
        for (int i =0;i<50;i++){
            System.out.print("第"+i+"次:");
            int fibonacci = fibonacci(i);
            System.out.println(fibonacci);
        }
    }

   static int count = 0;

    public static int fibonacci(int n){
        if (n == 0 || n == 1){
//            count++;
//            System.out.println("第"+count+"次:"+1);
            return 1;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
