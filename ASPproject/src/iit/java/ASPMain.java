package iit.java;

public class ASPMain {
    public static void main(String[] args) {
        Activity[] activities = {
            new Activity("A1", 0, 6),
            new Activity("A2", 3, 4),
            new Activity("A3", 1, 2),
            new Activity("A4", 5, 9),
            new Activity("A5", 5, 7),
            new Activity("A6", 8, 9)
        };

        ActivitySelectionProblem asp = new ActivitySelectionProblem();
        asp.printMaxActivities(activities);
    }
}
