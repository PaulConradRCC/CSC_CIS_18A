package pjc;

import java.util.Scanner;

public class Switch_demo_3 {

    public static void main(String[] args) {
        Scanner keybrd = new Scanner(System.in);
        
        System.out.print("> ");
        String command = keybrd.next().toLowerCase();
        
        switch(command)
        {
            case "ls":
                System.out.println("list directory...");
                break;
            case "cd":
                System.out.println("change directory...");
                break;
            case "pwd":
                System.out.println("present working directory...");
                break;
            case "lscpu":            
                System.out.println("list cpu...");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }
    
}
