package ca.monor.L3;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class L3_11_1_if_条件控制 {
    public static void main(String[] args) {
        /**
         * if(叙述表达式)
         * {
         * 小括号内为 true，执行{}内的程序
         * } else {
         * 否则执行此段
         * }
         */

//        Scanner scanVal1 = new Scanner(System.in);
//        System.out.println("INPUT :");
//        int intVal1 = scanVal1.nextInt();

        Random ranVal1 = new Random();
        int intVal1 = ranVal1.nextInt(20);

        if (intVal1 <= 10) {
            System.out.println("intVal1 <= 10, intVal1 = " + intVal1);
        } else {
            System.out.println("intVal1 > 10, intVal1 = " + intVal1);
        }

        Random ranNum2 = new Random();
        Random ranNum3 = new Random();

        int intNum2 = ranNum2.nextInt(10);
        int intNum3 = ranNum3.nextInt(10);

        System.out.println("intNum2 = " + intNum2);
        System.out.println("intNum3 = " + intNum3);

        if (intNum2 == intNum3) {
            System.out.println("Num 2 = Num 3");
        } else if (intNum2 > intNum3) {
            System.out.println("Num 2 > Num 3");
        } else {
            System.out.println("Num 2 < Num 3");
        }

        Scanner scanName1 = new Scanner(System.in);
        System.out.println("Please Input Familly Name");
        String strName1 = scanName1.next();

        Scanner scanName2 = new Scanner(System.in);
        System.out.println("Please Input Given Name");
        String strName2 = scanName2.next();

        Scanner scanNum1 = new Scanner(System.in);
        System.out.println("Please Input Score : ");
        int intScore = scanNum1.nextInt();

        if (intScore > 100 || intScore < 0) {
            System.out.println("Input Error");
        } else if (intScore == 100) {
            System.out.println(strName1 + " "+ strName2 + " ! You r Perfect");

        } else if (intScore >= 90) {
            System.out.println(strName1 + " "+ strName2 + " ! You r Exellent");
        } else if (intScore >= 80) {
            System.out.println(strName1 + " "+ strName2 + " ! You r Good");
        } else if (intScore >= 60) {
            System.out.println(strName1 + " "+ strName2 + " ! You passed");
        } else { // if (intScore >= 0) {
            System.out.println(strName1 + " "+ strName2 + " ! You did not pass");
        }
//        else {
//            System.out.println("Input Error");
//        }
    }
}
