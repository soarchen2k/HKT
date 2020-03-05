package ca.monor.L3;

import java.util.Arrays;

public class L3_13_2_抓取系统时间 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int[] intArray1;
        intArray1 = new int[3];

        /**
         * 一行定义阵列
         * 数据类型[] 阵列名称 = new 数据类型[阵列大小]
         */

        int[] intArray2 = new int[3];
        String[] strArray1 = new String[5];

        intArray2[0] = 10;
        intArray2[1] = 20;
        intArray2[2] = 99;

        System.out.println(intArray2[0]);
        System.out.println(intArray2[1]);
        System.out.println(intArray2[2]);

        strArray1[0] = "Chang San";
        strArray1[1] = "Lee Si";
        strArray1[2] = "Wong Mazi";

        System.out.println(strArray1[0]);
        System.out.println(strArray1[1]);
        System.out.println(strArray1[2]);

        /**
         * 一次性定义阵列类型和阵列数值
         * 数值类型[] 变量名称 = {数值1, 数值2, 数值3,....}
         * 之后可以通过索引值进行变量的修改
         */

        int[] intArray3 = {24, 28, 87};

        System.out.println(intArray3[0]);
        System.out.println(intArray3[1]);
        System.out.println(intArray3[2]);

        intArray3[0] = 87;
        intArray3[1] = 87987;
        intArray3[2] = 324;

        System.out.println(intArray3[0]);
        System.out.println(intArray3[1]);
        System.out.println(intArray3[2]);

        /**
         * 获取阵列长度
         */

        int[] inaArr1 = {100, 200, 300};
        System.out.println(inaArr1.length);

        /**
         * 获取阵列所有元素
         */

        int[] intArr2 = {3423, 324, 3232};
        System.out.println(Arrays.toString(intArr2));

        /**
         * 阵列排序
         */

        Arrays.sort(intArr2);
        System.out.println(Arrays.toString(intArr2));

        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

    }
}
