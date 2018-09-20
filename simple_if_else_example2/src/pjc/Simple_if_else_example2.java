package pjc;

import java.util.Scanner;

public class Simple_if_else_example2 {

    public static void main(String[] args) {        
        Scanner kb = new Scanner(System.in);
                
        // prompt the user for an integer number
        System.out.print("Enter an integer number: ");
        int num1 = kb.nextInt();
        
        // prompt the user for an integer number
        System.out.print("Enter another integer number: ");
        int num2 = kb.nextInt();
        
        if ( num2 == 0 )
        {
            System.out.println("Second number cannot be zero!");
            System.exit(1);
        }
        
        // output if number is even or odd
        if ( num1 % num2 == 0 )
            System.out.printf("%d and %d are multiples!\n",num1,num2);
        else if ( num2 % num1 == 0 )
            System.out.printf("%d and %d are multiples!\n",num1,num2);
        else
            System.out.printf("%d and %d are not multiples!\n",num1,num2);        
    }
}
