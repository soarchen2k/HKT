package ca.monor.L6;

import java.util.Scanner;

public class L6_18_2_构造 {
    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        System.out.println(demoClass.intVal);

        DemoClass demoClass1 = new DemoClass(25);
        System.out.println(demoClass1.intVal);
    }
}
