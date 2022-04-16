import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.Comparable;
import java.nio.file.*;
public class OperationToProduct {
    Node head;
    Node tail;
    String bcodeInput;
    String titleInput;
    int quantityInput;
    double priceInput;
    Scanner sc = new Scanner(System.in);
    LinkedList<Product> list = new LinkedList<Product>();
    Stack<Product> stack = new Stack<Product>();
    Queue<Product> queue = new LinkedList<Product>();
    public void getAllItemsFromFile(LinkedList<Product> list) {
        
        try {
            File myObj = new File("data.txt");
            Scanner sc2 = new Scanner(myObj);
            while (sc2.hasNext()) {
                Product temp = new Product();
                temp.bcode =sc2.nextLine();
                temp.title=sc2.nextLine();
                String temp1=sc2.nextLine();
                temp.quantity=Integer.parseInt(temp1);
                String temp2=sc2.nextLine();
                temp.price=Double.parseDouble(temp2);
                list.addLast(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // print out the list
        for (int i = 0; i < list.size(); i++) {
                    
            System.out.print(list.get(i).toString() + " ");
            System.out.println();
        }
        System.out.println();
    }
    public void getStack(Stack<Product> stack) {
        try {
            File myObj = new File("data.txt");
            Scanner sc2 = new Scanner(myObj);
            while (sc2.hasNext()) {
                Product temp = new Product();
                temp.bcode =sc2.nextLine();
                temp.title=sc2.nextLine();
                String temp1=sc2.nextLine();
                temp.quantity=Integer.parseInt(temp1);
                String temp2=sc2.nextLine();
                temp.price=Double.parseDouble(temp2);
                stack.push(temp);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         while (stack.empty()!=true)
         {  
            //Product temp = new Product();
            System.out.println(stack.pop());
         }
    }
    public void getQueue(Queue<Product> queue) {
        try {
            File myObj = new File("data.txt");
            Scanner sc2 = new Scanner(myObj);
            while (sc2.hasNext()) {
                Product temp = new Product();
                temp.bcode =sc2.nextLine();
                temp.title=sc2.nextLine();
                String temp1=sc2.nextLine();
                temp.quantity=Integer.parseInt(temp1);
                String temp2=sc2.nextLine();
                temp.price=Double.parseDouble(temp2);
                queue.add(temp);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(queue.toString());
        queue.clear();
    }
    public int addLastToList(LinkedList<Product> list) {
            Product temp = new Product();
            System.out.println("Input: ");
            System.out.println("Bar Code: ");
            bcodeInput=sc.nextLine();
            temp.bcode=bcodeInput;
            for (int i = 0; i < list.size(); i++) {
            if((list.get(i).bcode).equals(bcodeInput)){
                System.out.println("Barcode already exist. ");
                return -1;
            }
            }
            System.out.println("Title: ");
                titleInput=sc.nextLine();
                temp.title=titleInput;
                System.out.println("Quantity: ");
                quantityInput=sc.nextInt();
                temp.quantity=quantityInput;
                sc.nextLine();
                System.out.println("Price: ");
                priceInput=sc.nextDouble();
                temp.price=priceInput;
                sc.nextLine();
                list.addLast(temp);
                return 0;
    }
    public void displayAll(LinkedList<Product> list) { //Method to display the products from LinkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).toString() + " "); 
            System.out.println();
        }
        System.out.println();
    }
    public void writeAllItemsToFile(LinkedList<Product> list) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter writer = new FileWriter("data.txt"); //Write data to file data.txt
        for (int i = 0; i < list.size(); i++) {
            writer.write(list.get(i).bcode +"\n");
            writer.write(list.get(i).title +"\n");
            writer.write(String.valueOf(list.get(i).quantity) +"\n");
            writer.write(String.valueOf(list.get(i).price) +"\n");
        }
        writer.close();
    }
    public void searchByCode(LinkedList<Product> list) {
        System.out.println("Input ID: ");
        bcodeInput=sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if((list.get(i).bcode).equals(bcodeInput)){
                System.out.println(list.get(i).toString()+" ");
            }
            else System.out.println("-1");
        }
    }
    public void deleteByCode(LinkedList<Product> list) {
        System.out.println("Input ID: ");
        bcodeInput=sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if((list.get(i).bcode).equals(bcodeInput)){
                list.remove(i);
            }
        }
    }
    public void sortByCode(LinkedList<Product> list) {
        Collections.sort(list, Comparator.comparing(Product::getBcode));
    }
    public int convertToBinary(int a) {
        if (a==0){
        return 0;
        }
        else
        return (a % 2 + 10 * convertToBinary(a/2));
    }
}
