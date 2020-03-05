package ca.monor.L4;

public class L4_16_3_Return {
    public static void main(String[] args) {
        int[] intArr1 = {5, 4, 3, 2, 1};
        printData(intArr1);

        int[] intArr2 = null;
        printData(intArr2);

        int[] intArr3 = {1, 2, 3, 4, 5};
        printData(intArr3);

        int[] intArr4 = null;
        printData(intArr4);

    }

    private static void printData(int[] intArr) {
        if (intArr == null) {
            System.out.println("DATA ERROR");
            return;
            /**
             * 遇到 return，则返回程序顶部，开始执行 intArr2，
             * 不会继续执行 for 语句
             */
        }

        for (int i : intArr) {
//            System.out.printf("* ");
            System.out.println(i);
        }
    }
}
