package ca.monor.L2;

public class L2_8_1_资料转换_字串整数互转 {
    public static void main(String[] args) {
        /**
         *  byte > short > char > int > long > float > double
         */

        /**
         * small > big
         */
        byte byteVal1 = 100;
        int intVal1 = byteVal1;
        System.out.println("intVal1 = " + intVal1);

        /**
         * big > small
         */
        int intVal2 = 200;
        byte byteVal2 = (byte) intVal2;
        System.out.println("byteVal2 = " + byteVal2);

        /**
         * 整数转字串
         */
        int intVal3 = 500;
        String strVal3 = Integer.toString(intVal3);
        System.out.println("strVal3 = " + strVal3);

        /**
         * 字串转整数
         */
        String strVal4 = "900";
        int intVal4 = Integer.parseInt(strVal4);
        System.out.println("intVal4 = " + intVal4);



    }
}
