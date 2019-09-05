package ArrayLists.AddressBook;

import java.util.Scanner;

public class Main{
   private static MobilePhone phone = new MobilePhone("9089925727");
   private static Scanner scan = new Scanner(System.in);
   public static void main(String[] args) {

      
      System.out.println("My Phone Address BooK Starting...");
      boolean bye = false;
      displayMenu();
      while (!bye) {
         
         System.out.println("Enter your option (press 6 to display options)");
         int key = scan.nextInt();
         scan.nextLine();

         switch (key) {
            case 1:
               phone.display();
               break;
            
            case 2:
               adding();
               break;

            case 3:
               deleting();
               break;

            case 4:
               editing();
               break;

            // case 5:
            //    searching();
            //    break;

            case 6:
            displayMenu();
            break;

            default:
               bye = true;
               System.out.println("Good-Bye");
               break;
         }
      }
   }

   private static void editing() {
      System.out.println("What contact would you like to edit?");
      String name = scan.nextLine();
      Contacts exists = phone.conQuery(name);
      if (name == null) {
         System.out.println("Contact not found in your Address Book");
         return;
      }
      System.out.println("Enter new name");
      String newName = scan.nextLine();
      System.out.println("Enter Phone Number");
      String newNum = scan.nextLine();
      Contacts updated = Contacts.create(newName, newNum);
      phone.updateContact(exists, updated);
   }

   private static void deleting() {
      System.out.println("What contact would you like to remove?");
      String name = scan.nextLine();
      Contacts exists = phone.conQuery(name);
      if (exists == null) {
         System.out.println("not found");
         return;
      }

      if (phone.remove(exists)){
         System.out.println("yes");
      } else {
         System.out.println("noooooo");
      }
   }

   private static void adding() {
      System.out.println("Enter new contact name");
      String name = scan.nextLine();
      System.out.println("Enter Phone number");
      String number = scan.nextLine();
      Contacts newe = Contacts.create(name, number);
      phone.addContact(newe);
   }














      public static void displayMenu() {
         System.out.println("Choose an option: \n 1. to display your contact list\n " +
         "2. to add a new contact\n 3. to delete a contact\n 4. to edit a contact\n " + 
         "5. to search\n 6. to exit");
      }
}