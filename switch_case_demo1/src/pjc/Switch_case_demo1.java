package pjc;

import java.util.Scanner;

public class Switch_case_demo1 {

    public static void main(String[] args) {
        
        //java.util.Scanner keybrd = new java.util.Scanner(System.in);
        Scanner keybrd = new Scanner(System.in);
        
        System.out.println("Sample Program Menu");
        System.out.println("1. Option #1");
        System.out.println("2. Option #2");
        System.out.println("3. Option #3");
        System.out.println("4. Quit Program");
        System.out.print("Enter menu choice (1-4):");
        
        int choice = keybrd.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.println("You chose option 1");
                //break;
            case 2:
                System.out.println("You chose option 2");
                //break;
            case 3:
                System.out.println("You chose option 3");
                //break;
            case 4:
                System.out.println("You chose option 4");
                //break;
            default:
                System.out.println("Invalid entry");
        }
    }
    
}
