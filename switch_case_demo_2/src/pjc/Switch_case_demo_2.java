
package pjc;

import java.util.Scanner;

public class Switch_case_demo_2 {

    public static void main(String[] args) {
        Scanner keybrd = new Scanner(System.in);
        
        System.out.print("Enter assignment score: ");
        int score = keybrd.nextInt();
        
        switch(score)
        {
            case 11:
                System.out.println("A grade with Early Bird Bonus!");
                break;
            case 10:
            case 9:
                System.out.println("A grade!");
                break;
            case 8:
                System.out.println("B grade!");
                break;
            case 7:
                System.out.println("C grade!");
                break;
            case 6:
                System.out.println("D grade!");
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                System.out.println("F grade!");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }
    
}
