package ca.monor.L6;

public class Account {

    /**
     * 存取修飾子
     * Java 共有四種存取修飾子 public、protected、default 和 private，
     * 可用來修飾類別、方法和變數。不同存取修飾子，各有不同的存取權限。
     * 另外，在類別上存取的定義，是指可以使用該類別來建立物件。
     * 在方法上的定義，是指可以透過點「.」的運算子呼叫該方法進行運算。
     * 在變數上的定義，是指可以透過點「.」的運算子直接儲存和獲取資料。
     *
     * 存取修飾子開放權由大到小：public -> protected -> default -> private
     */

    public int userID;

    private String name;
    private int balance;
}
