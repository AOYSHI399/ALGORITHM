package iit.java;

import java.util.Arrays;

public class ActivitySelectionProblem {

    public void printMaxActivities(Activity[] activities) {
        int n = activities.length;

        // Sort activities by finish time
        Arrays.sort(activities, new ASPComparator());

        System.out.println("Selected Activities:");

        int i = 0;
        System.out.print(activities[i].getName());

        for (int j = 1; j < n; j++) {
            if (activities[j].getStart() >= activities[i].getFinish()) {
                System.out.print(" -> " + activities[j].getName());
                i = j;
            }
        }

        System.out.println();
    }
}
