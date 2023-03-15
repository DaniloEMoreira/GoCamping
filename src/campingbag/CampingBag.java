/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campingbag;

import Items.Item;
import java.util.ArrayList;

/**
 * 
 * 
 * @author danil
 */
public class CampingBag {
    
    private int capacity;
    private ArrayList<Item> bagContents = new ArrayList<Item>();
    
    /**
     * Create a camping bag with a given capacity
     * @param capacity - the capacity as an int
     */
    public CampingBag(int capacity) {
        
        this.capacity = capacity;
    }
    
    /**
     * @return true if bag is full, else false
     */
    public boolean isFull(){
        if (bagContents.size() >= capacity){
            System.out.println("The bag is full");
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * @param thingToAdd - an object that is an Item or a sub-class of Item - to be added to the bag contents
     * @return - true if the item added successfully; false if the item could not be added
     */
    public boolean addItem(Item thingToAdd){
        int size = thingToAdd.getSize();
        if (!isFull()){
            this.bagContents.add(thingToAdd);
            this.capacity -= (size-1);
            System.out.println("Successfully added.");
            System.out.println(this.bagContents);
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * 
     * @param size the size of the item to know if it will fit in the Bag
     * @return True if the size of Item is small the space left in the bag / False if it is bigger
     */
    public boolean willFit(int size){
        if (size <= (capacity - this.bagContents.size())){
            System.out.println("Fit!");
            return true;
        } else {
            System.out.println("It doesn't fit, remove something...");
            return false;
        }
    }
    /**
     * 
     * @return Show all Content of the bag
     */
    public String showContent(){
        return this.bagContents.toString();
    }
    
 /**
  * 
  * @param item
  * @return the size of removed item
  */
    private void createSpace(Item item){
        int size = item.getSize();
        this.capacity += (size-1);
    }
    
    /**
     * 
     * @param position is the locale of the item to remove from the list
     */
    public void removeItem(int position){
        int realPosition = position-1;
        createSpace(this.bagContents.get(realPosition));
        this.bagContents.remove(realPosition);
        System.out.println(bagContents.toString());
    }
    
}
