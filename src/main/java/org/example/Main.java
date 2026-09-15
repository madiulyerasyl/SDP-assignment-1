package org.example;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(
                45.0,
                40.0,
                20.0
        );

        Computer computer = new Computer.Builder(
                "Intel Core i5",
                16,
                512,
                "Windows 11"
        )
                .withGraphicsCard("RTX 4060")
                .enableWiFi()
                .enableBluetooth()
                .enableGamingMode()
                .withPrice(1200.0)
                .withDimensions(dimensions)
                .build();

        System.out.println(computer);
    }
}