/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gocamping;


import Items.Clothes;
import Items.Water;
import Items.Food;
import Items.Soda;
import campingbag.CampingBag;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author danil
 */
public class GoCamping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sizeOfBag = 0; //initialsed 
        
        System.out.println("What is the size of your bag in liter?");
        Scanner myKb = new Scanner(System.in);
        String answer = myKb.nextLine();
        sizeOfBag = parseInt(answer);
        System.out.println(sizeOfBag);
        
        CampingBag myCampingBag  = new CampingBag(sizeOfBag);
        int exit = 0;
        System.out.println("Lets prepare our CampingBag");
        do{
            int choose = 0;
            System.out.println("\nWhat you want to do ?");
            System.out.println("\n1: ADD a Item\n2: Remove a Item\n0: Exit");
            String answerMenu = myKb.nextLine();
            choose = parseInt(answerMenu);
            System.out.println("==================================");
            
            if(choose == 1){
                System.out.println("what kind of product do you want?");
                System.out.println("1: Water\n2: Foods\n3: Clothes\n4: Soda");
                String drinkFood = myKb.nextLine();
                int add = parseInt(drinkFood);
                if (add == 1){
                    Water water = new Water(2,"Water");
                    if (myCampingBag.willFit(water.getSize())){
                        myCampingBag.addItem(water);
                    }
                }
                if (add == 2){
                    Food food = new Food(2,"Food");
                    if (myCampingBag.willFit(food.getSize())){
                        myCampingBag.addItem(food);
                    }
                }
                if (add == 3){
                    Clothes clothes = new Clothes(2,"Clothes");
                    if (myCampingBag.willFit(clothes.getSize())){
                        myCampingBag.addItem(clothes);
                    }
                }
                if (add == 4){
                    Soda soda = new Soda(2,"Soda");
                    if (myCampingBag.willFit(soda.getSize())){
                        myCampingBag.addItem(soda);
                    }
                }
                System.out.println("==================================");
                exit = choose;
            }else if(choose == 2){
                System.out.println("which item do you want to remove?");
                System.out.println(myCampingBag.showContent());
                String removeItem = myKb.nextLine();
                int remove = parseInt(removeItem);
                myCampingBag.removeItem(remove);
                System.out.println("==================================");
                exit = choose;
            }else{
                exit = choose;
            }
        }while(exit != 0);
        System.out.println("\nTank You!");
    }
}