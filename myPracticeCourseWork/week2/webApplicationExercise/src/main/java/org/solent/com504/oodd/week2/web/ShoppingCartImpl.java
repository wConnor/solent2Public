/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.oodd.week2.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.solent.com504.oodd.week2.model.ShoppingCart;
import org.solent.com504.oodd.week2.model.ShoppingItem;

/**
 *
 * @author cgallen
 */
public class ShoppingCartImpl implements ShoppingCart{
    
        private HashMap<String,ShoppingItem> itemMap = new HashMap<String,ShoppingItem>();

    @Override
    public List<ShoppingItem> getShoppingCartItems() {
    List<ShoppingItem> itemlist  = new ArrayList();
    for(String itemUUID :itemMap.keySet()){
        ShoppingItem shoppingCartItem = itemMap.get(itemUUID);
        itemlist.add(shoppingCartItem);
    }
    return itemlist;
    }

    @Override
    public void addItemToCart(ShoppingItem shoppingItem) {
        itemMap.put(shoppingItem.getUuuid(), shoppingItem);
    }

    @Override
    public void removeItemFromCart(String itemUuid) {
        List<ShoppingItem> items = getShoppingCartItems();
        
        for (int i = 0; i != items.size(); ++i) {
            if (items.get(i).getUuuid().equals(itemUuid)) {
                itemMap.remove(items.get(i).getUuuid(), items.get(i));
            }
        }    
    }

    @Override
    public double getTotal() {
        List<ShoppingItem> items = getShoppingCartItems();
        double totalPrice = 0;
        
        for (int i = 0; i != items.size(); ++i) {
            totalPrice += items.get(i).getPrice();
        }    
        return totalPrice;
    }
  
}
