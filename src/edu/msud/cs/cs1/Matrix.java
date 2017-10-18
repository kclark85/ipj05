package edu.msud.cs.cs1;

import edu.princeton.cs.introcs.StdArrayIO;

public class Matrix {

    public static double dot(double[] x, double[] y) {
        int n = x.length;
        double sum = 0;
        if (x.length != y.length) {
            System.out.println("undefined dimensions");
        } else {
            for (int i = 0; i < n; i++) {
                sum += x[i] * y[i];
            }
        }
        return sum;
    }

    public static double[][] multiply(double[][] x, double[][] y) { //matrix-matrix
        double[][] c = new double[x.length][y[0].length];
        /* ^^create new array two hold both arrays, of size R: array 1 rows, C: array 2 columns*/

        if (y.length == x[0].length) {
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < y[0].length; j++) {

                    for (int k = 0; k < x[0].length; k++) {
                        c[i][j] += x[i][k] * y[k][j];

                    }

                }
            }
        } else {
            System.out.println("Dimension requirements not satisfied for accurate calculation");
        }
        return c;
    }

    public static double[] multiply(double[] x, double[][] y) { //vector-matrix
        double[] c = new double[y[0].length];
//        System.out.println(y[0].length);
        /* ^^create new array two hold both arrays, of size R: array 1 rows, C: array 2 columns*/

//            c[0] = x[0] * y[0][0];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y[0].length; j++) {

                c[j] += x[i] * y[i][j];

            }
        }

        return c;
    }

    public static double[] multiply(double[][] x, double[] y) { //matrix-vector
        double[] c = new double[x.length];
        if (y.length != x.length) {
            System.out.println("Array dimensions not satisfied for multiplication");
        }

        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < x.length; j++) {

                c[j] += x[i][j] * y[j];

            }
        }

        return c;
    }

    public static double[][] transpose(double[][] a) {
        double[][] c = new double[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

                c[j][i] = a[i][j];


            }
        }
        return c;
    }

    public static void printArray(double[][] v) //static method to print results of other methods
    {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(double[] v) //static method to print results of other methods
    {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

        public static void main (String[] args)
    {
//        double[] a = { 1,2,3,4 };
//        double[] b = { 1,2,3,4 };
//        System.out.println(dot(a,b));
        double[][]a = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                //print array a
        };
        double[]b = {
                -1,-2,-3

        };
        double[][] c = transpose(a);

        StdArrayIO.print(a);
        StdArrayIO.print(b);
        StdArrayIO.print(c);
    }

}
