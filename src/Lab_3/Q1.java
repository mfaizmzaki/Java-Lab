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
public class Q1 {
    public Q1(){
        
        int input1, input2;
        char operand;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter two integer number: ");
        input1 = keyboard.nextInt();
        input2 = keyboard.nextInt();
        
        System.out.println("Enter the operand: ");
        String tempOperand = keyboard.next();
        operand = tempOperand.charAt(0);
        
        if(operand == '+'){
            int sum = input1 + input2;
            System.out.printf("%d %c %d = %d\n", input1, operand, input2, sum);
        }
        else if(operand == '-'){
            int minus = input1 - input2;
            System.out.printf("%d %c %d = %d\n", input1, operand, input2, minus);
        }
        else if(operand == '*'){
            int prod = input1 * input2;
            System.out.printf("%d %c %d = %d\n", input1, operand, input2, prod);
        }
        else if(operand == '/'){
            int div = input1 / input2;
            System.out.printf("%d %c %d = %d\n", input1, operand, input2, div);
        }
        else if(operand == '%'){
            int remainder = input1 % input2;
            System.out.printf("%d %c %d = %d\n", input1, operand, input2, remainder);
        }
        else
        System.out.println("Answer could not be calculated");
        
        
        
    }
}
