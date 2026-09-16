package org.example;

public class ComputerDirector {

    public Computer createBasicComputer() {
        return new Computer.Builder(
                "Intel Core i3",
                8,
                256,
                "Windows 11"
        )
                .withPrice(500.0)
                .build();
    }

    public Computer createOfficeComputer() {
        return new Computer.Builder(
                "Intel Core i5",
                16,
                512,
                "Windows 11"
        )
                .enableWiFi()
                .enableBluetooth()
                .withPrice(800.0)
                .build();
    }

    public Computer createGamingComputer() {
        return new Computer.Builder(
                "Intel Core i7",
                32,
                1000,
                "Windows 11"
        )
                .withGraphicsCard("RTX 4070")
                .enableWiFi()
                .enableBluetooth()
                .enableGamingMode()
                .withPrice(1800.0)
                .withDimensions(new Dimensions(45.0, 20.0, 40.0))
                .build();
    }
}