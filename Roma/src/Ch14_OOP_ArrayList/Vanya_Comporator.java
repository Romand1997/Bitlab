package Ch14_OOP_ArrayList;

import java.util.Comparator;

public class Vanya_Comporator implements Comparator<BankApplicatiion> {
    @Override
    public int compare(BankApplicatiion o1, BankApplicatiion o2) {
        return o1.compareTo(o2);
    }
}
