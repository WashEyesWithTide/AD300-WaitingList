public class Main {
    public static void main(String[] args) {
        WaitingListManager manager = new WaitingListManager();

        manager.addPerson("Alice");
        manager.addPerson("Bob");
        manager.addPerson("Charlie");
        manager.addPerson("Alice"); // Duplicate entry

        manager.displayWaitingList();

        System.out.println("Serving: " + manager.servePerson());
        System.out.println("Is Bob in the list? " + manager.isPersonInList("Bob"));
        System.out.println("Waiting list size: " + manager.getWaitingListSize());

        manager.displayWaitingList();
    }
}