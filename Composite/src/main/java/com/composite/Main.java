package com.composite;

import com.composite.operations.Add;
import com.composite.operations.Digit;
import com.composite.operations.Multiply;
import com.composite.operations.Operation;

public class Main {
    public static void main(String[] args) {
        //(1+2)*4+5*(3+6) = 12 + 45 = 57
        System.out.println(composite(1, 2, 4, 5, 3, 6));
    }

    private static double composite(int a, int b, int c, int d, int e, int f){
        Operation operation= new Add(
                new Multiply(
                        new Add(new Digit(a), new Digit(b)),
                        new Digit(c)
                ),
                new Multiply(
                        new Digit(d),
                        new Add(new Digit(e), new Digit(f))
                )
        );
        return operation.execute();
    }
}
