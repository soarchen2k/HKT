package ca.monor.L4;

public class L4_15_1_WHILE {
    /**
     * 使用 While 循环实现 1+2+3+...+99+100
     * @param args
     */
    public static void main(String[] args) {
        int intVal1 = 1;
        int i = 1;
        int m = 1;
        int n = 1;
        while (intVal1 <= 99) {
            System.out.println("Time = " + intVal1);
            System.out.println("i = " + i);
            n = ++n;
            System.out.println("m = " + n);
            i = i + ++m;
            System.out.println(i);
            intVal1++;
        }
    }
}
