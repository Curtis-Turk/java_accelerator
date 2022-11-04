package shopping;

import java.util.ArrayList;

public class ShoppingList {
  ArrayList<ShoppingItem> list = new ArrayList<ShoppingItem>();

  ShoppingList() {
  }

  public void addItem(ShoppingItem item) {
    list.add(item);
  }

  public ArrayList<ShoppingItem> getItems() {
    return list;
  }
}
