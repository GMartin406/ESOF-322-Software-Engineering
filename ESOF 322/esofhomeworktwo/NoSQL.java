/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esofhomeworktwo;

import java.io.PrintWriter;

/**
 *
 * @author Greg
 */
public class NoSQL implements IDatabase{
    public void Store(){
        try {
            PrintWriter output = new PrintWriter("NoSQLStorage.txt","UTF-8");
            output.println("NoSQL Storage Worked");
            System.out.println("Storage Successful!");
            output.close();
        } catch (Exception ex) {
            System.out.println("Exception!");
        }
    }
}
