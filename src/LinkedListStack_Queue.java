import java.util.*;

class LinkedListStack_Queue {

  private Scanner keyboard = new Scanner(System.in);
  private LinkedList<String> stack_Queue = new LinkedList<>();
  private String tempRemoveCopy;
  private String tempAddCopy;

  void push() {
    if (stack_Queue.size() == 10) {
      System.out.println("List is full start making space ");
    } else {
      System.out.println("Enter String: ");
      String userIN = keyboard.nextLine();
      setAddCopy(userIN);
      stack_Queue.add(userIN);
    }
  }

  private void setAddCopy(String userIN) {
    this.tempAddCopy = userIN;
  }

  void copy() {
    if (stack_Queue.size() == 10) {
      System.out.println("List is full start making space ");
    } else {
      stack_Queue.add(tempAddCopy);
    }
  }

  private void setTempRemovCopy(String userIN) {
    this.tempRemoveCopy = userIN;
  }

  void remove() {
    try {
      System.out.println("Removing String.");
      setTempRemovCopy(stack_Queue.getLast());
      stack_Queue.removeLast();
    } catch (NoSuchElementException e) {
      System.out.println("Empty list please add string first");
    }
  }

  void undo() {
    if (tempRemoveCopy == null) {
      System.out.println("Empty list please add string");
    } else {
      stack_Queue.add(tempRemoveCopy);
    }
  }

  void printList() {
    System.out.println(stack_Queue);
  }
}
