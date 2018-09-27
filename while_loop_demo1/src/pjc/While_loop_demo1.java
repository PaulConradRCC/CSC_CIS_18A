package pjc;

import java.util.Scanner;

public class While_loop_demo1 {

    public static void main(String[] args) {

        Scanner keybrd = new Scanner(System.in);
        
        int x;
        boolean invalid_entry;
        
        do
        {
            System.out.println("Enter a value for x (be greater than 0),");
            System.out.print("and I'll sum all integers from 1 to x: ");
            x = keybrd.nextInt();
            invalid_entry = x <= 0;
            
            if (invalid_entry) 
                System.out.println("\nInvalid entry!!! Must be greater than zero!!!");
        } while (invalid_entry);
        
        // sum up all integers from 1 to x
        long sum=0;
        int i=1;
        
        while (i <= x)
        {
            sum=sum+i;
            i=i+1;
        }
        
        System.out.printf("The sum of integers from 1 to %d is %d\n",x,sum);
    }
    
}
