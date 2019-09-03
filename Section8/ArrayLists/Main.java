import java.util.Scanner;

public class Main{

   private static Scanner scan = new Scanner(System.in);
   private static List david = new List();

   public static void main(String[] args) {

      // david.addItem("Milk");
      // david.addItem("Bread");
      // david.printList();
      System.out.println("Select ONE of the following options");
      System.out.println("\t1. Display List");
      System.out.println("\t2. Add item");
      System.out.println("\t3. Delete item");
      System.out.println("\t4. Search item");
      System.out.println("\t5. Modify item");
      System.out.println("\t6. Exit");


      
      boolean exit = false;
      while (!exit) {
         System.out.println("Enter your choice: ");
         int choice = scan.nextInt();
         scan.nextLine();

         switch (choice) {
            case 1:
               david.printList();
               break;

            case 2:
               add();
               break;

            case 3: 
            removeItem();
            break;

            case 4:
            searchItem();
            break;

            case 5:
            modifyItem();
            break;
         
            default:
            System.out.println("Good Bye");
               exit = true;
               break;
         }
      }  

   }

   public static void add(){
      System.out.println("Add item to your list...");
      david.addItem(scan.nextLine());
   }

   public static void modifyItem(){
      System.out.println("What item number would you like to modify?");
      int position = scan.nextInt();
      scan.nextLine();
      System.out.println("Enter new value:");
      String newItem = scan.nextLine();
      david.modify(position-1, newItem);
   }

   public static void searchItem(){
      System.out.println("Type item to be searched:");
      String text = scan.nextLine();
      if (david.search(text) != null) {
         System.out.println("Item \"" + text + "\" Found!");
      } else {
         System.out.println("Item is NOT in your list!");
      } 
   } 

   public static void removeItem(){
      System.out.println("What item number would you like to delete?");
      int position = scan.nextInt();
      scan.nextLine();
      david.remove(position-1);
   }
}
