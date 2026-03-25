import java.util.Scanner;

import static java.lang.Math.pow;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr_num = {1,2,3,4,5};
        System.out.println(sum(4));
        System.out.println(sum_arr(arr_num , 4));
        System.out.println(power(4 , 3));
        System.out.println(revers(3 , scanner));
    }


    public static int sum(int n ) {
        if (n == 1) return 1;
        return n * n + sum(n-1);
    }

    public static int sum_arr(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + sum_arr(arr , n -1);
    }

    public static double power(int b , int n) {
        if (n == 0) {
            return 1;
        }
        return pow(b, n) + power(b , n-1);
    }

    public static int revers(int n, Scanner sc) {
        if (n == 0) {
            return 0;
        }

        int stack = sc.nextInt();
        revers(n - 1, sc);
        System.out.print(stack + " ");

        return 1;
    }
}

