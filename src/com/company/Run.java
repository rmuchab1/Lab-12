package com.company;

public class Run {
    public static void RunCode(ShapesEnum se) {
        if (se.count >= 0) {
            System.out.printf("%s has %s cornors.%n",
                    se.name(), se.count);
        } else {
            System.out.println("Sorry, we can't read that shape.");
        }
    }
}
