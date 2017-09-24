/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;
import java.util.Random;

/**
 *
 * @author mfaizmzaki
 */
public class sumOfNumbers {
    
    private int inputNumber;
    
    public sumOfNumbers(int input){
        this.inputNumber = input;
    }
    
    public void calcSum(){
        int sum = 0;
        int temp = this.inputNumber;
        
        while(temp != 0){
            
            //get last digit
            int singleDigit = temp%10;
            sum += singleDigit;
            
            //remove last digit
            temp /= 10;
        }
        
        System.out.println("Number: " + this.inputNumber);
        System.out.println("Sum: " + sum);
        
    }
    
    public static void main(String [] args){
        
        Random generator = new Random();
        int MAX = 10000;
        sumOfNumbers calc = new sumOfNumbers(generator.nextInt(MAX));
        calc.calcSum();
          
    }
    
}
