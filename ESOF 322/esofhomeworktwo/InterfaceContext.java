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
public class InterfaceContext {
    private IDatabase database_strategy;
    public void setStoreStrategy(IDatabase database_strategy){
        System.out.println("Setting storage strategy");
        this.database_strategy = database_strategy;
    }
    public void Store(){
        System.out.println("Calling store function");
        database_strategy.Store();
    }
}
