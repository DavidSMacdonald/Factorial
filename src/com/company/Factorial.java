package com.company;

public class Factorial {
    public long calcFactorial(int n) {
        long pro = 1;
        while (n > 0) {
            pro *= n;
            n--;
        }
        return pro;
    }

    public double calcE() {
        double e = 1.0;
        double olde = 0.0;
        int i = 1;
        while (e - olde > 0.001) {
            olde = e;
            e += 1.0/(calcFactorial(i));
            i++;
        }
        return e;
    }

    public double calcEX(int x) {
        double e = 1.0;
        double olde = 0.0;
        int i = 1;
        while (e - olde > 0.001) {
            olde = e;
            e += 1.0*Math.pow(x,i)/(calcFactorial(i));
            i++;
        }
        return e;
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        for (int i = 1; i <= 20; i++) {
            System.out.println(f.calcFactorial(i));
        }

        System.out.println();

        System.out.printf("e is %2.3f \n", f.calcE());

        for (int i = 1; i <= 5; i++) {
            System.out.printf("e to the power of " + i + " = %2.3f\n",f.calcEX(i));
        }

    }
}

/* OUTPUT */
//        1
//        2
//        6
//        24
//        120
//        720
//        5040
//        40320
//        362880
//        3628800
//        39916800
//        479001600
//        6227020800
//        87178291200
//        1307674368000
//        20922789888000
//        355687428096000
//        6402373705728000
//        121645100408832000
//        2432902008176640000
//
//        e is 2.718
//        e to the power of 1 = 2.718
//        e to the power of 2 = 7.389
//        e to the power of 3 = 20.085
//        e to the power of 4 = 54.598
//        e to the power of 5 = 148.413