
import java.util.Scanner;

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
        int numberOfRooms;
        int x = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many Rooms in the home to be painted?");
        numberOfRooms = keyboard.nextInt();
        
        for (int i = 1; i <= numberOfRooms; i = i + 1) {
        System.out.println("Enter square feet or room");
        int Newx = keyboard.nextInt();
        }
    }
}