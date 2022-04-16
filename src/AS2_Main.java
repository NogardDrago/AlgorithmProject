import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.Comparable;
import java.nio.file.*;
public class AS2_Main {
    public static void main(String[] args) throws Exception {
        int input=11;
        Stack<Product> stack = new Stack<Product>();
        Queue<Product> queue = new LinkedList<Product>();
        Scanner sc = new Scanner(System.in);
        LinkedList<Product> list = new LinkedList<Product>();
        OperationToProduct op = new OperationToProduct();
        do{
        System.out.println("Choose one of this options:");
        System.out.println("Product list:");
        System.out.println("1. Load data from file and display");
        System.out.println("2. Input & add to the end.");
        System.out.println("3. Display data");
        System.out.println("4. Save product list to file.");
        System.out.println("5. Search by ID");
        System.out.println("6. Delete by ID");
        System.out.println("7. Sort by ID.");
        System.out.println("8. Convert to Binary");
        System.out.println("9. Load to stack and display");
        System.out.println("10. Load to queue and display.");
        System.out.println("0. Exit");
        input=sc.nextInt();
        sc.nextLine();
        switch(input){
            case 1:
                //Read from file, every 4th line is a completed product
                op.getAllItemsFromFile(list);
                break;
            case 2:
                op.addLastToList(list);
                break;
            case 3:
                op.displayAll(list);
                break;
            case 4:
                op.writeAllItemsToFile(list);
                break;
            case 5:
                op.searchByCode(list);
                break;
            case 6:
                op.deleteByCode(list);
                break;
            case 7:
                op.sortByCode(list);
                break;
            case 8:
                System.out.println(op.convertToBinary(list.getFirst().quantity));
                break;
            case 9:
                op.getStack(stack);
                break;
            case 10:
                op.getQueue(queue);
                break;
        }
    }while (input!=0);

    }
}