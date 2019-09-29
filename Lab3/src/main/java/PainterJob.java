
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chase
 */
public class PainterJob { 

    public static void main(String[] args) {
       int rooms; 
       double sum = 0;
       double wallSpace;
       double gallonPrice;
       double gallonsRequired;
       double laborHours;
       double paintCost;
       double charges;
       double total;
       
       DecimalFormat format = new DecimalFormat("#0.00");
       String input = JOptionPane.showInputDialog("Enter the number of rooms: ");
       rooms = Integer.parseInt(input);
       
       while (rooms < 1) {
       input = JOptionPane.showInputDialog("Enter the number of rooms: ");
       rooms = Integer.parseInt(input);     
       }
       
       for(int x = 1; x<= rooms; x++) {
           input = JOptionPane.showInputDialog("Enter the square feet of the room: ");
           wallSpace = Double.parseDouble(input);
           
           sum = sum + wallSpace;
       }
       
       input = JOptionPane.showInputDialog("Enter the price of the paint per gallon: ");
       gallonPrice = Double.parseDouble(input);
       gallonsRequired = numberOfGallons(sum);
       System.out.println("The number of gallons of paint required is: " + Math.round(gallonsRequired));
        
       laborHours = hoursOfLabor(gallonsRequired);
       System.out.println("The hours of labor required is: " + format.format(laborHours));
        
       paintCost = costOfPaint(gallonsRequired, gallonPrice);
       System.out.println("The cost of the paint is: $" + format.format(paintCost));
        
       charges = laborCharges(laborHours);
       System.out.println("The labor charges are: $" + format.format(charges));
        
       total = totalCost(paintCost, charges);
       System.out.println("The total cost of paint job is: $" + format.format(total));   
    }

        static double numberOfGallons(double sum) {
            return (sum/115);
        }
        
        static double hoursOfLabor(double gallonsRequired) {
            return gallonsRequired * 8;
        }
        
        static double costOfPaint(double gallonsRequired, double gallonPrice) {
            return gallonsRequired * gallonPrice;
        }
        
        static double laborCharges(double laborHour) {
            return laborHour * 18;
        }
        
        static double totalCost(double paintCost, double charges) {
            return paintCost + charges;
        }
}