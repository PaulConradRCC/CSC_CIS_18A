package pjc;

public class Fractions {
    private int numerator=0;
    private int denominator=1;

    /**
     * @return the numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * @param numerator the numerator to set
     */
    public void setNumerator(int numerator) {
        int g = this.gcd(numerator, this.denominator);
        this.numerator = numerator/g;
    }

    /**
     * @return the denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * @param denominator the denominator to set
     */
    public void setDenominator(int denominator) {
        if (denominator != 0)
        {
            int g = this.gcd(this.numerator, denominator);
            this.denominator = denominator/g;
        }
        else
            throw new IllegalArgumentException("Denominator cannot be zero!");
    }
    
    // constructors
    public Fractions()
    {
        this.numerator=0;
        this.denominator=1;
    }
    
    public Fractions(int numerator, int denominator)
    {
        //throw new UnsupportedOperationException("Need to implement Fractions(int, int) constructor");
        int g = this.gcd(numerator, denominator);
        this.setNumerator(numerator/g);
        this.setDenominator(denominator/g);                
    }
    
    public Fractions(Fractions org)
    {
        this.setNumerator(org.getNumerator());
        this.setDenominator(org.getDenominator());
    }
        
    @Override
    public String toString()
    {
        return this.numerator + " / " + this.denominator;
    }
    
    private int gcd(int a, int b)
    {
        if (a==0) return b;
        return gcd( b%a, a );
    }
    
    public Fractions exp(Fractions op, int n)
    {
        // throw new UnsupportedOperationException("Fractions.exp TODO!");
        int num=op.numerator;
        int den=op.denominator;
        
        for(int i=1;i<n;i++)
        {
            num *= op.numerator;
            den *= op.denominator;
        }
        
        return new Fractions( num, den );
    }
    
    public Fractions add(Fractions op2)
    {
        int a = this.numerator;
        int b = this.denominator;
        int c = op2.numerator;
        int d = op2.denominator;
        
        if ( b*d == 0 ) // this in theory should never occur!
            throw new ArithmeticException("Add: unexpected arithmetic exception");
        
        return new Fractions(a*d + b*c, b*d );
    }
    
    public Fractions sub(Fractions op2)
    {
        int a = this.numerator;
        int b = this.denominator;
        int c = op2.numerator;
        int d = op2.denominator;
        
        if ( b*d == 0 ) // this in theory should never occur!
            throw new ArithmeticException("Sub: unexpected arithmetic exception");
        
        return new Fractions(a*d - b*c, b*d );
    }
    
    public Fractions multiply(Fractions op2)
    {
        int a = this.numerator;
        int b = this.denominator;
        int c = op2.numerator;
        int d = op2.denominator;
        
        if ( b*d == 0 ) // this in theory should never occur!
            throw new ArithmeticException("Multiply: unexpected arithmetic exception");
            
        return new Fractions(a*c, b*d );
    }
    
    public Fractions divide(Fractions op2)
    {
        int a = this.numerator;
        int b = this.denominator;
        int c = op2.numerator;
        int d = op2.denominator;
        
        if ( b*c == 0 )
            throw new ArithmeticException("Division by zero!");
        
        return new Fractions(a*d, b*c );
    }
}
