package com.company;


import org.junit.*;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;


public class main {
    public static void main(String args[]) {
        int a, b, c, i;
        System.out.println("input a b c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        i = triangleType(a, b, c);
        System.out.println("Number of type is " + i);
        System.out.print("Triangle sides " + a + " ");
        System.out.print(b + " ");
        System.out.println(c);


    }


    @Test
    public void firstTest() {
        Assert.assertTrue(true);

        assertEquals(1,triangleType(2,3,4));
        assertEquals(2,triangleType(2,2,1));
        assertEquals(3,triangleType(2,2,2));
        assertEquals(4,triangleType(2,4,7));
        assertEquals(4,triangleType(0,0,0));
        assertEquals(4,triangleType(-10, 10, 50));
    }


    private static int triangleType (int a, int b, int c) {
        int i = 0;

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("a/b/c must be bigger than 0");
            i = 4;
        }
        else if ((a >= b + c) || (b >= a + c) || (c >= a + b)) {
            System.out.println("it is impossible to construct this triangle");
            i = 4;
        }
        else if ((a == b && a == c) || (a == b && b == c) || (a == c && b == c))
            i = 3;

        else if (a == b || a == c || b == c)
            i = 2;

        else if (a != b && a !=c && b!=c)
            i = 1;

        return i;
    }
}

