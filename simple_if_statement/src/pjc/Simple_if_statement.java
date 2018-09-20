package pjc;

import java.util.Scanner;

public class Simple_if_statement {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
                
        // prompt the user for an integer number
        System.out.print("Enter an integer number: ");
        int num = kb.nextInt();
                       
        // simple if statement for absolute value
        int abs = num;
        
        if (num < 0)  
            abs = -abs;        
              
        // output the absolute value
        System.out.printf("The absolute value of %d is %d\n",num,abs);
    }
    
}
