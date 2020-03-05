package ca.monor.L4;

public class L4_16_1_Break {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        for (int i : intArr) {
            if (i > 3) {
                break;

                /**
                 * 当 if 条件不满足的时候，程序会循环执行 sout
                 * 当 if 条件满足时，中断循环，并终止程序
                 */
            }
            System.out.println(i);
        }
    }
}
