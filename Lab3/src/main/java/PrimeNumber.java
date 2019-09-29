
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
public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        String input = JOptionPane.showInputDialog("Please enter the number: ");
        
        number = Integer.parseInt(input);
        
        if(isPrime(number))
            JOptionPane.showMessageDialog(null, "That is a prime number");
        else
            JOptionPane.showMessageDialog(null, "That is not a prime number");
    }
    public static boolean isPrime(int number) {
        int count = 0;
        for(int i = 2; i <= number/2; i++) {
            if(number%i == 0)
                count++;
        }
        if(count > 0)
            return false;
        else
            return true;
    }
    
}
