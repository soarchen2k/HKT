package ca.monor.L6;

import java.util.Scanner;

public class L6_18_1_CLASS {
    public static void main(String[] args) {
        Role role = new Role();  // Package 内存在 Role 的 public class，可以读取

        Scanner scanner = new Scanner(System.in);
        System.out.println("please input name :");
        role.nickName = scanner.next();

        System.out.println("Please select gender M/F :");
        role.gender = scanner.next();

        System.out.println("Please Input your Skill :");
        role.skill = scanner.next();

        System.out.println(role.nickName);
        System.out.println(role.gender);
        System.out.println(role.skill);

        role.walk();
        role.run();
        role.attack();
    }
}
