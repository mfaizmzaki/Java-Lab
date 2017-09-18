/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1Q2;

/**
 *
 * @author mfaizmzaki
 */
public class MyProfile {
   
    
    public static void main(String[] args){
        
        String name = "Faiz Zaki";
        int age = 25;
        char sex = 'M';
        String location = "KL";
//        
//        System.out.println("Name\t\tAge\tSex\tLocation");
//        System.out.println(name + "\t" + age + "\t" + sex + "\t" + location);
          System.out.format("%32s%10d%16s", name, age, location);
          
    }
    
    
    
}
