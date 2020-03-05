package ca.monor.L4;

public class L4_15_2_WHILE {
    /**
     * 使用 WHILE 循环计算每天比前一天多一倍，最后的总和是多少
     * @param args
     */
    public static void main(String[] args) {
        int intVal1 = 1;
        long i = 1;
        long m = 1;
//        int n;
        while (intVal1 <= 29) {
            System.out.println("Time = " + intVal1);
            System.out.println("i = " + i);
            m = m * 2;
            System.out.println("m = " + m);
            i = i + m;
            System.out.println("Sum = " + i);
            intVal1++;
        }
    }
}
