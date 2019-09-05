package ArrayLists;

import java.util.ArrayList;

public class List{
   private ArrayList<String> groceryList = new ArrayList<String>();

   public void addItem(String item){
      groceryList.add(item);
   }

   public void printList(){
      System.out.println(groceryList.size() + " item(s) found in your list.");
      for (int i = 0; i < groceryList.size(); i++) {
         System.out.println((i+1) + ". " + groceryList.get(i));
      }
   }

   public void modify(int position, String newItem){
      groceryList.set(position, newItem);
      System.out.println("Item number " + (position+1) + " changed!");
   }

   public void remove(int position){
      String getItem = groceryList.get(position);
      groceryList.remove(position);
      System.out.println("Item \"" + getItem + "\" removed!"); 
   }

   public String search(String findItem){
      // boolean exists = groceryList.contains(findItem);
      int position = groceryList.indexOf(findItem);
      if (position>=0) {
         return groceryList.get(position);
      } else {
         return null;
      }
   }

}


