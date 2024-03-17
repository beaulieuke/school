import java.util.*;

public class M2L1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create a linkedlist called rainbow
        LinkedList<String> rainbow = new LinkedList<>();

        // load roygbiv to linkedlist
        rainbow.add("Red");
        rainbow.add("Orange");
        rainbow.add("Yellow");
        rainbow.add("Green");
        rainbow.add("Blue");
        rainbow.add("Indigo");
        rainbow.add("Violet");

        // display number of items in llrainbow and print values of llrainbow
        System.out.println("Number of items in Rainbow list: " + rainbow.size());
        System.out.println("Rainbow List: " + rainbow);

        // prompt the user for a color to add at the beginning
        System.out.print("Enter a color to add at the beginning: ");
        String colorToAddAtBeginning = scanner.nextLine();
        rainbow.addFirst(colorToAddAtBeginning);
        System.out.println(
                "Updated Rainbow List after adding " + colorToAddAtBeginning + " at the beginning: " + rainbow);

        // prompt the user for a color to add at the end
        System.out.print("Enter a color to add at the end: ");
        String colorToAddAtEnd = scanner.nextLine();
        rainbow.addLast(colorToAddAtEnd);
        System.out.println("Updated Rainbow List after adding " + colorToAddAtEnd + " at the end: " + rainbow);

        // prompt the user for a color to remove from the list
        while (true) {
            System.out.print("Enter a color to remove from the list (or type 'exit' to quit): ");
            String colorToRemove = scanner.nextLine();
            if (colorToRemove.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                break;
            }
            if (rainbow.remove(colorToRemove)) {
                System.out.println(colorToRemove + " removed from the list.");
            } else {
                System.out.println(colorToRemove + " not found in the list.");
            }
            System.out.println("Updated Rainbow List: " + rainbow);
        }

        scanner.close();
    }
}