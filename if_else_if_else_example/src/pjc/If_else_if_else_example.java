package pjc;

import java.util.Scanner;

public class If_else_if_else_example {

    // constants to promote good programming practice
    static final double A_GRADE = 88.0;
    static final double B_GRADE = 76.0;
    static final double C_GRADE = 64.0;
    static final double D_GRADE = 52.0;
    static final double F_GRADE = 0.0;
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
                
        // prompt the user for an integer number
        System.out.print("Enter the course score: ");
        double courseScore = kb.nextDouble();
        
        // output the letter grade based on courseScore
        if ( courseScore >= A_GRADE )
        {
            System.out.println("The course grade is A!!!");
            System.out.println("This is excellent!");
        }
        else if ( courseScore >= B_GRADE )
        {
            System.out.println("The course grade is B!!!");
            System.out.println("This is very good!");
        }
        else if ( courseScore >= C_GRADE )
        {
            System.out.println("The course grade is C!!!");
            System.out.println("This is good!");
        }
        else if ( courseScore >= D_GRADE )
        {
            System.out.println("The course grade is D!!!");
            System.out.println("This is not passing!");
        }
        else if ( courseScore >= F_GRADE )
        {
            System.out.println("The course grade is F!!!");
            System.out.println("This is not passing!");
        }
        else
            System.out.println("Course score entered is not in the range!");
    }
}
