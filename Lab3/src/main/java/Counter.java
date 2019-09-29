

import java.util.Random;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chase
 */
public class Counter {

    public static boolean isEven(int number) {
        if(number % 2 == 0)
            return(true); //true for even numbers
        else
            return(false); //false for odd numbers
    }
    
    public static void main(String[] args) {
         Random rand = new Random();
         
         int evenCount = 0;
         int oddCount = 0;
         
         for(int i = 1; i <= 100; i++){
             int number = rand.nextInt();
             
                if(isEven(number)) {
                    evenCount++;
                } else
                    oddCount++;
                    
         }
         
         System.out.println("Number of even number is: " + evenCount);
         System.out.println("Number of odd numbers is: " + oddCount);
    }
}
