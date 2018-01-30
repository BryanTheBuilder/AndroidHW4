/**
 * Bryant's Contribution I worked on creating the switch method for input and suggested what
 * framework we would have in our linked list where we added and removed the strings
 */

import java.util.*;

public class Main {
  private static LinkedListStack_Queue nuevoList = new LinkedListStack_Queue();

  public static void main(String[] args) {
    options();
    nuevoList.printList();
  }

  private static void options() {
    int quitLoop = 0;
    do {
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Options.");
      System.out.println("Type \"add\" to input a string to list.");
      System.out.println("Type \"copy\" to re-enter last string.");
      System.out.println("Type \"delete\" to remove last string.");
      System.out.println("Type \"undo\" to add back removed string.");
      System.out.println("Type \"quit\" to exit program.");
      System.out.println("Enter a command: ");
      String command = keyboard.nextLine();
      command = command.toUpperCase();
      switch (command) {
        case "ADD":
          nuevoList.push();
          break;
        case "COPY":
          nuevoList.copy();
          break;
        case "DELETE":
          nuevoList.remove();
          break;
        case "UNDO":
          nuevoList.undo();
          break;
        case "QUIT":
          System.out.println("Ending process.");
          quitLoop++;
          break;
        default:
          System.out.println("Enter valid input: ");
      }
    } while (quitLoop == 0);
  }
}
