/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3;
import java.util.Scanner;
/**
 *
 * @author mfaizmzaki
 */
public class Q3 {
    public Q3(){
        
        double commission;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter sales volume: ");
        int sales = keyboard.nextInt();
        
        if(sales <= 100){
            commission = 0.05 * sales;
        }
        else if (sales > 100 && sales <= 500){
            commission = 0.075 * sales;
        }       
        else if (sales > 500 && sales <= 1000){
            commission = 0.1 * sales;
        }
        else
            commission = 0.125 * sales;
        
        System.out.printf("Commission is: %.2f\n", commission);
    }
}
