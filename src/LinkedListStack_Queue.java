import java.util.*;
public class LinkedListStack_Queue {

    Scanner keyboard = new Scanner(System.in);
    private LinkedList <String> stack_Queue = new LinkedList<>();
        private String tempRemoveCopy;
        private String tempAddCopy;

    public void push()
    {
        System.out.println("Enter String: ");
        String userIN = keyboard.nextLine();
        setAddCopy(userIN);
        stack_Queue.add(userIN);
    }

    public void setAddCopy(String userIN)
    {
        this.tempAddCopy = userIN;
    }

    public void copy()
    {
        stack_Queue.add(tempAddCopy);
    }

    public void setTempRemovCopy( String userIN) {
        this.tempRemoveCopy = userIN;
    }

    public void remove() {
        try {
            System.out.println("Removing String.");
            setTempRemovCopy(stack_Queue.getLast());
            stack_Queue.removeLast();
        }catch (NoSuchElementException e)
        {
            System.out.println("Empty list please add string first");
        }
    }

    public void undo() {
        if( tempRemoveCopy == null) {
            System.out.println("Empty list please add string");
        } else {
            stack_Queue.add(tempRemoveCopy);
        }
    }
    public void printList()
    {
        System.out.println(stack_Queue);
    }
}
