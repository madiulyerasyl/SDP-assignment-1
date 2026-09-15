package org.example;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(
                45.0,
                40.0,
                20.0
        );

        Computer computer = new Computer(
                "Intel Core i5",
                16,
                512,
                "Windows 11",
                true,
                "RTX 4060",
                true,
                true,
                true,
                1200.0,
                dimensions
        );

        System.out.println(computer);
    }
}