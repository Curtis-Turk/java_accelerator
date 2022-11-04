package shopping;

import org.junit.Test;

import org.junit.Assert;

public class ShoppingListTest {

  @Test
  public void initialsesWithEmptyList() {
    ShoppingList shopList = new ShoppingList();
    Assert.assertEquals(0, shopList.getItems().size());
  }

  @Test
  public void canAddItemsToList() {
    ShoppingList shopList = new ShoppingList();
    shopList.addItem(new ShoppingItem("Tofu", 4.99));
    Assert.assertEquals("Adds something to the list", 1, shopList.getItems().size());
  }
}
