import java.util.ArrayList;

public class MobilePhone{
   private String myNumber;
   private ArrayList<Contacts> myBook; 


   public MobilePhone(String myNumber) {
      this.myNumber = myNumber;
      this.myBook = new ArrayList<Contacts>();
   }
   public void display(){
      System.out.println("* Address Book *");
      for (int i = 0; i < this.myBook.size(); i++) {
         System.out.println((i+1) + ". " + this.myBook.get(i).getName() + "\t#" + this.myBook.get(i).getNumber());
      }
   }

   public boolean addContact(Contacts contact){
      if (findContact(contact.getName()) >= 0) {
         System.out.println("This contact already exists");
         return false;
      } else {
         myBook.add(contact);
         return true;
      }
   }

   private int findContact(Contacts contact) {
      return this.myBook.indexOf(contact);
   }

   private int findContact(String contactName) {
      for (int i = 0; i < myBook.size(); i++) {
         Contacts contact = this.myBook.get(i);
         if (contact.getName().equals(contactName)) {
            return i;
         }
      }
      return -1;
   }

   public Contacts conQuery(String name){
      int pos = findContact(name);
      if (pos >= 0) {
         return this.myBook.get(pos);
      }
      return null;
   }





   public boolean updateContact(Contacts exists, Contacts replace){
      int found = findContact(exists);
      if (found < 0) {
         System.out.println(exists.getName() + ", not found");
         return false;
      } else {
         this.myBook.set(found, replace);
         System.out.println(exists.getName() + ", changed to " + replace.getName());
         return true;
      }
   }

   public String query(Contacts contact){
      if (findContact(contact) >= 0) {
         return contact.getName();
      }
      return null;
   }

   public boolean remove(Contacts contact){
      int found = findContact(contact);
      if (found < 0) {
         System.out.println(contact.getName() + ", not found");
         return false;
      } else{ 
      this.myBook.remove(found);
      System.out.println(contact.getName() + ", has been removed");
      return true;
      }
   }
}