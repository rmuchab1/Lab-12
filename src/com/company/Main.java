package com.company;
enum ShapesEnum {
    TRIANGLE(3);

    final int count;

    ShapesEnum(int count) {
        this.count = count;
    }
}
public class Main {

    public static void main(String[] args) {
            ShapesEnum se = ShapesEnum.TRIANGLE;
            Run.RunCode(se);
        }
    }

