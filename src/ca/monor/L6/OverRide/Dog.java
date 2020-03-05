package ca.monor.L6.OverRide;

public class Dog extends Animal {

    /**
     * 子类别继承父类别后，重新定义方法 move
     * 父类别继承来的 move 即被覆盖
     */
    public void move() {

        /**
         * 使用 super.方法名
         * 即可再次呼叫出被覆盖度父类别
         */
        super.move();
        System.out.println("Dog Move");
    }
}
