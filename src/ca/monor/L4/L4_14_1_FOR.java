package ca.monor.L4;

public class L4_14_1_FOR {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("i : " + i);

            int[] intArr = {10, 20, 5, 3, 100};
            for (int a : intArr) {
                System.out.println(a);
            }
        }
    }
}
