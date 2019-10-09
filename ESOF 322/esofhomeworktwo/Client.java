/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esofhomeworktwo;

/**
 *
 * @author Greg
 */
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hi! We are just getting started.");
        System.out.println("Please select one of these storage options to get rolling:");
        System.out.println("Relational");
        System.out.println("NoSQL");
        System.out.println("Graph");
        System.out.println("Type q to quit");
        //Setting default storage pattern
        InterfaceContext ic = new InterfaceContext();
        String input = in.nextLine();
        while(!(input.equals("q"))){
            if(input.equals("Relational")){
                ic.setStoreStrategy(new Relational());
                ic.Store();
            }
            else if(input.equals("NoSQL")){
                ic.setStoreStrategy(new NoSQL());
                ic.Store();
            }
            else if(input.equals("Graph")){
                ic.setStoreStrategy(new Graph());
                ic.Store();
            }
            else{
                System.out.println("Sorry, please pick from one of the three options!");
            }
            System.out.println("Please select one of these storage options to get rolling:");
            System.out.println("Relational");
            System.out.println("NoSQL");
            System.out.println("Graph");
            System.out.println("Type q to quit");
            input = in.nextLine();
           
        }
    }
}
