package ca.monor.L2;

import javax.sound.midi.Soundbank;

public class L2_9_1_运算符号 {
    public static void main(String[] args) {

/**
 *  +=  -=  *=  /=  %=
 *  a += b > a = a+ b
 */
//        int a = 10;
//        int b = 2;
//        System.out.println(a += b);
//        System.out.println(a -= b);
//        System.out.println(a *= b);
//        System.out.println(a /= b);
//        System.out.println(a %= b);

        /**
         * && and
         * || or
         * ! inverse of boolean
         */

//        boolean a = true;
//        boolean b = false;
//
//        System.out.println(a && b);
//        System.out.println(a || b);
//        System.out.println(!a);
//        System.out.println(!b);

        /**
         * == 两值相等则为 true
         * != 两值不等则为 true
         * > 左大于右为 true
         * < 右大于左为 true
         * <=
         * >=
         */

//        int a = 100;
//        int b = 66;
//
//        System.out.println(a == b);
//        System.out.println(a != b);
//        System.out.println(a > b);
//        System.out.println(a < b);
//        System.out.println(a >= b);
//        System.out.println(a <= b);

        /**
         * 条件运算符号 / 三元运算
         * 数据类型 变量名称 = (运算条件) ? 条件为 true 时的值 : 条件为 false 时的值
         */

//        int a = 10;
//        int b = 2;
//        int c = 2;
//
//        String result1 = (a == b) ? "a = b" : "a != b";
//        String result2 = (c == b) ? "c = b" : "c != b";
//
//        System.out.println(result1);
//        System.out.println(result2);

        /**
         * instanceof 用来判断是否同一个特定类别
         */

        String a = "HKT";
        int b = 109;
        System.out.println(a instanceof String);

    }
}
