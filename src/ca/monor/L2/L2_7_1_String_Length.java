package ca.monor.L2;

import java.util.Scanner;

public class L2_7_1_String_Length {
    public static void main(String[] args) {
        String strVal = "Welcom";
        System.out.println(strVal);
        String str1 = "最近";
        String str2 = "我很好";
        /**
         *   %s 字符串格式化
         *   必须用 printf 来印出格式
         */
        System.out.printf("Hello, %s好么？ %s", str1, str2);
        System.out.println();

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("PLZ Input");

        String str3 = sc1.nextLine();
        String str4 = sc2.nextLine();
        System.out.printf("Hello, %s好么？ %s", str3,str4);
        System.out.println();

        /**
         * 使用 lenth 方法，统计字串长度
         */

        Scanner str = new Scanner(System.in);
        System.out.println("Please Input Name :");
        String name = str.nextLine();
        System.out.printf("The name '%s' length is : %s", name, name.length());

    }



}
