import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        System.out.println("Welcome to the Inventory Management System!");
        Inventory newInventory = new Inventory();
        printMsg();
        while(true)
        {
            input = scanner.next();
            if (input.equals("1"))
                newInventory.addItem(scanner);
            if (input.equals("2"))
                newInventory.updateItem(scanner);
            if (input.equals("3"))
                newInventory.viewInventory();
            if (input.equals("4"))
                newInventory.searchInventory(scanner);
            if (input.equals("Exit") || input.equals("6"))
                break;
            printMsg();
        }
    }
    static void printMsg(){
        System.out.println("Enter your choice.");
        System.out.println("1. Add item\n2.Update item\n3.View Inventory\n4.Search item\n5.Exit");
    }
}