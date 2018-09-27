package pjc;

import java.util.Scanner;

public class Do_while_loop_demo {

    public static void main(String[] args) {

        Scanner keybrd = new Scanner(System.in);
        
        System.out.print("Enter a value for x, and I'll sum all integers from 1 to x: ");
        int x = keybrd.nextInt();
        
        // sum up all integers from 1 to x
        long sum=0;
        int i=1;
        
        do
        {
            sum=sum+i;
            i=i+1;
        } while (i <= x);
        
        System.out.printf("The sum of integers from 1 to %d is %d\n",x,sum);
    }
    
}
