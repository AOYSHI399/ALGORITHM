package iit.java;

import java.util.Comparator;

public class ASPComparator implements Comparator<Activity> {
    @Override
    public int compare(Activity a1, Activity a2) {
        return Integer.compare(a1.getFinish(), a2.getFinish());
    }
}
