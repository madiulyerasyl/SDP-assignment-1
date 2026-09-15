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

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public boolean hasDedicatedGraphics() {
        return dedicatedGraphics;
    }

    public String getGpu() {
        return gpu;
    }

    public boolean hasWiFi() {
        return wifi;
    }

    public boolean hasBluetooth() {
        return bluetooth;
    }

    public boolean isGamingMode() {
        return gamingMode;
    }

    public double getPrice() {
        return price;
    }

    public Dimensions getDimensions() {
        return dimensions;
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
            validate();
            return new Computer(this);
        }

        private void validate() {

            if (ram <= 0) {
                throw new IllegalArgumentException("RAM must be greater than 0");
            }

            if (storage <= 0) {
                throw new IllegalArgumentException("Storage must be greater than 0");
            }

            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative");
            }

            if (gamingMode && ram < 16) {
                throw new IllegalStateException(
                        "Gaming mode requires at least 16 GB RAM"
                );
            }

            if (gamingMode && !dedicatedGraphics) {
                throw new IllegalStateException(
                        "Gaming mode requires a dedicated graphics card"
                );
            }
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