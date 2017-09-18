/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


/**
 *
 * @author mfaizmzaki
 */
public class Lab1 {

    private String model = "Samsung";
        
    public int addNumber(int x, int y){
        return x + y;
    }
    
    public int minusNumber(int x, int y){
        return x - y;
    }
    
    public int multNumber(int x, int y){
        return x*y;
    }
    
    public float divNumber(int x, int y){
        return (float)x/(float)y;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lab1 calc = new Lab1();
        System.out.println("Old model: " + calc.model);
        calc.setModel("Nokia");
        System.out.println("New model: " + calc.model);
        System.out.printf("%d\n", calc.addNumber(5, 10));
        System.out.printf("%d\n", calc.minusNumber(5, 10));
        System.out.printf("%4.3f\n", calc.divNumber(100, 3));
        
    }

    
}
