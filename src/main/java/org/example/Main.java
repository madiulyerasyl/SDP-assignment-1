package org.example;

public class Main {

    public static void main(String[] args) {

        ComputerDirector director = new ComputerDirector();

        Computer basic = director.createBasicComputer();
        Computer office = director.createOfficeComputer();
        Computer gaming = director.createGamingComputer();

        System.out.println("BASIC:");
        System.out.println(basic);

        System.out.println("\nOFFICE:");
        System.out.println(office);

        System.out.println("\nGAMING:");
        System.out.println(gaming);
    }
}