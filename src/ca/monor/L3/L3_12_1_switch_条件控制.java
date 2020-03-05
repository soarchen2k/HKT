package ca.monor.L3;

import java.util.Scanner;

public class L3_12_1_switch_条件控制 {
    public static void main(String[] args) {

        /**
         * switch ( expression )
         * {
         * case value :
         * break;
         *
         * case value :
         * break;
         *
         * defaute :
         */

        /*
        switch(expression)
{
    case value:
      //上方小括號內常數值等於此條件 value，則會進來此處，執行此區塊程式
    break;
    case value:
      //上方小括號內常數值等於此條件 value，則會進來此處，執行此區塊程式
    break;
    case value:
      //上方小括號內常數值等於此條件 value，則會進來此處，執行此區塊程式
    break;
    case value:
      //上方小括號內常數值等於此條件 value，則會進來此處，執行此區塊程式
    break;
    case value:
      //上方小括號內常數值等於此條件 value，則會進來此處，執行此區塊程式
    break;
    default :
            假設上方條件皆不成立，，則會進來此處，執行此區塊程式
}
         */

        Scanner scanScore = new Scanner(System.in);
        System.out.println("Input Score (0-5) :");
        int intScore = scanScore.nextInt();

        switch (intScore) {
            case 5:
                System.out.println("Perfect");
                break;

            case 4:
                System.out.println("Excellent");
                break;

            case 3:
                System.out.println("Good");
                break;
            case 2:
                System.out.println("Passed");
                break;

            case 1:
                System.out.println("Not Passed");
                break;

            case 0:
                System.out.println("No Score");
                break;

            default:
                System.out.println("Error");
        }

    }
}
