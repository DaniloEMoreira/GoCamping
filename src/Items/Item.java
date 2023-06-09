/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 * 
 * 
 * @author danil
 */
public abstract class Item {
    
    private int size;  //the amount of space that this item will occupy
    private String description; // a text description of the item
    
    /**
     * Create a specific item object
     * @param size - the amount of space it occupies, stored as an int
     * @param description - a text description of the item, stored as a String
     */
    public Item(int size, String description) {
        this.size = size;
        this.description = description;
    }

    /**
     * 
     * @return the size of the item
     */
    public int getSize() {
    return size;
    }
    
    /**
     * provide a description of the item in String format
     * @return the description of the item
     */
    @Override
    public String toString(){
        return this.description;
    }

}