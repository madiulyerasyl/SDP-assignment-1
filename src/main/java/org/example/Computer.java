package org.example;

public class Computer {

    private String cpu;
    private int ram;
    private int storage;
    private String operatingSystem;

    private boolean dedicatedGraphics;
    private String gpu;
    private boolean wifi;
    private boolean bluetooth;
    private boolean gamingMode;
    private double price;
    private Dimensions dimensions;

    public Computer(
            String cpu,
            int ram,
            int storage,
            String operatingSystem,
            boolean dedicatedGraphics,
            String gpu,
            boolean wifi,
            boolean bluetooth,
            boolean gamingMode,
            double price,
            Dimensions dimensions
    ) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.dedicatedGraphics = dedicatedGraphics;
        this.gpu = gpu;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.gamingMode = gamingMode;
        this.price = price;
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", dedicatedGraphics=" + dedicatedGraphics +
                ", gpu='" + gpu + '\'' +
                ", wifi=" + wifi +
                ", bluetooth=" + bluetooth +
                ", gamingMode=" + gamingMode +
                ", price=" + price +
                ", dimensions=" + dimensions +
                '}';
    }
}