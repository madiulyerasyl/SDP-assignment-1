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

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.operatingSystem = builder.operatingSystem;

        this.dedicatedGraphics = builder.dedicatedGraphics;
        this.gpu = builder.gpu;
        this.wifi = builder.wifi;
        this.bluetooth = builder.bluetooth;
        this.gamingMode = builder.gamingMode;
        this.price = builder.price;
        this.dimensions = builder.dimensions;
    }

    public static class Builder {

        private String cpu;
        private int ram;
        private int storage;
        private String operatingSystem;

        private boolean dedicatedGraphics = false;
        private String gpu = "Integrated";
        private boolean wifi = false;
        private boolean bluetooth = false;
        private boolean gamingMode = false;
        private double price = 0.0;
        private Dimensions dimensions = null;

        public Builder(String cpu, int ram, int storage, String operatingSystem) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
            this.operatingSystem = operatingSystem;
        }

        public Builder withGraphicsCard(String gpu) {
            this.gpu = gpu;
            this.dedicatedGraphics = true;
            return this;
        }

        public Builder enableWiFi() {
            this.wifi = true;
            return this;
        }

        public Builder enableBluetooth() {
            this.bluetooth = true;
            return this;
        }

        public Builder enableGamingMode() {
            this.gamingMode = true;
            return this;
        }

        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder withDimensions(Dimensions dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
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