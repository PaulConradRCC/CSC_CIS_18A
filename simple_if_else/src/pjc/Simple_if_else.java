package pjc;

import java.util.Scanner;

public class Simple_if_else {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
                
        // prompt the user for an integer number
        System.out.print("Enter an integer number: ");
        int num = kb.nextInt();
        
        // output if number is even or odd
        if ( num%2 == 0 )
            System.out.printf("%d is even!\n",num);
        else
            System.out.printf("%d is odd!\n",num);        
    }
    
}
