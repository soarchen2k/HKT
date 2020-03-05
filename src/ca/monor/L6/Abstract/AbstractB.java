package ca.monor.L6.Abstract;

public class AbstractB extends AbstractA {
    @Override
    void makeMoney() {
        super.makeMoney();
        System.out.println("Lost Money");
    }
}
