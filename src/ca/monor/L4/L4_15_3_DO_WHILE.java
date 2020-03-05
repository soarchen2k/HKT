package ca.monor.L4;

import java.util.Scanner;

public class L4_15_3_DO_WHILE {
    public static void main(String[] args) {
        /**
         *
         */

//        Scanner scanVal1 =new  Scanner(System.in);
//        String input;
//        do {
//            System.out.println("是否离开系统");
//            input = scanVal1.next();
//        } while (!input.equals("y"));
//        System.out.println("已经离开系统");

        int count = 1;
        int a = 1;
        int b = 1;
        int c = 1;
        do {
            System.out.println("a = " + a);
            c = ++c;
            System.out.println("b = " + c);
            b = ++b;
            a = a + b;
            System.out.println("Sum = " + a);
            count = count++;
        } while (count == 10);
        System.out.println("SUM = " + a);


    }
}
