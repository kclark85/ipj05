package edu.msud.cs.cs1;

public class Hyperbolic {

    public static double sinh ( double x){
        double value = (1-((Math.exp(-2*x))))/(2*(Math.exp(-1*x)));
        return value;
    }
    public static double cosh (double x){
        double value = (1+((Math.exp(-2*x))))/(2*(Math.exp(-1*x)));
        return value;
    }
    public static double tanh (double x) {
        double value = (1-((Math.exp(-2*x))))/(1+((Math.exp(-2*x))));
        return value;
    }
    public static double coth (double x) {
        double value = (1+((Math.exp(-2*x))))/(1-((Math.exp(-2*x))));
        if(x==0) {
            throw new ArithmeticException("division by zero attempt error");
        }
        return value;
    }
    public static double sech (double x) {
        double value = (2*(Math.exp(-1*x)))/(1+((Math.exp(-2*x))));
        return value;
    }
    public static double csch (double x) {
        double value = (2*(Math.exp(-1*x)))/(1-((Math.exp(-2*x))));
        if(x==0) {
            throw new ArithmeticException("division by zero attempt error");
        }
        return value;
    }

    public static void main (String[] args){

        System.out.println("x = " + args[0]);
        System.out.println("Sinh(x) = " + sinh(Double.parseDouble(args[0])));
        System.out.println("Cosh(x) = " + cosh(Double.parseDouble(args[0])));
        System.out.println("Tanh(x) = " + tanh(Double.parseDouble(args[0])));
        System.out.println("Coth(x) = " + coth(Double.parseDouble(args[0])));
        System.out.println("Sech(x) = " + sech(Double.parseDouble(args[0])));
        System.out.println("Csch(x) = " + csch(Double.parseDouble(args[0])));
    }
}
