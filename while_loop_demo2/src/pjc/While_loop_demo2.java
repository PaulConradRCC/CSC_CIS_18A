package pjc;

import java.util.Scanner;

public class While_loop_demo2 {

    public static void main(String[] args) {
        Scanner keybrd = new Scanner(System.in);
        
        System.out.print("Enter a value for x: ");
        int x = keybrd.nextInt();
        
        System.out.printf("Enter a value for y, and I'll sum all integers from %d to y: ", x);
        int y = keybrd.nextInt();
        
        // sum up all integers from x to y
        long sum=0;
        int i=x;
        
        while (i <= y)
        {
            sum=sum+i;
            i=i+1;
        }
        
        System.out.printf("The sum of integers from %d to %d is %d\n",x,y,sum);
    }
    
}
