package org.example;

public class Main {

    public static void main(String[] args) {

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
                1200.0
        );

        System.out.println(computer);
    }
}
