package ca.monor.L4;

public class L4_16_2_Continue {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        for (int i : intArr) {
            if (i < 3) {
                continue;
                /**
                 * 当程序遇到 continue 的时候，并且 if 的条件满足，则会终止一次 sout 的执行
                 * 但是会重新回到 for 循环继续执行剩余的部分
                 */
            }
            System.out.println(i);
        }
    }
}
