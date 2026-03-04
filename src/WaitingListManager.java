import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;

public class WaitingListManager {

    private LinkedList<String> waitingList;
    private Set<String> waitingSet; // To track unique names in the waiting list

    public WaitingListManager() {
        this.waitingList = new LinkedList<>();
        this.waitingSet = new HashSet<>();
    }

    public void addPerson(String name) {
        if (waitingSet.contains(name)) {
            System.out.println(name + " is already in the waiting list.");
            return;
        }
        waitingList.add(name);
        waitingSet.add(name);
    }

    public String servePerson() {
        waitingSet.remove(waitingList.peek()); // Remove the person being served from the set
        return waitingList.poll();
    }

    public boolean isPersonInList(String name) {
        return waitingList.contains(name);
    }

    public int getWaitingListSize() {
        return waitingList.size();
    }

    public void displayWaitingList() {
        System.out.println("Waiting List:");
        for (String name : waitingList) {
            System.out.println(name);
        }
    }
}
