package Design_Principles.KISS;

public class Calculator {
    public double calculator (double a , double b , String s)
    {
        double result=0;
        switch(s)
        {
            case "+":
                result = a+b;
                break;
            case "*":
                result = a*b;
                break;
        }
        return result;
    }
    // for simplicity 2 operations are done here
}
