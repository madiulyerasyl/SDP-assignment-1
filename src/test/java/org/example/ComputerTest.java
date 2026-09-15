package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {

    // 1. Valid construction
    @Test
    void shouldCreateBasicComputer() {
        Computer computer = new Computer.Builder(
                "Intel Core i3",
                8,
                256,
                "Windows 11"
        ).build();

        assertEquals("Intel Core i3", computer.getCpu());
        assertEquals(8, computer.getRam());
        assertEquals(256, computer.getStorage());
    }

    // 2. Valid construction
    @Test
    void shouldCreateOfficeComputer() {
        Computer computer = new Computer.Builder(
                "Intel Core i5",
                16,
                512,
                "Windows 11"
        )
                .enableWiFi()
                .enableBluetooth()
                .withPrice(800.0)
                .build();

        assertTrue(computer.hasWiFi());
        assertTrue(computer.hasBluetooth());
        assertEquals(800.0, computer.getPrice());
    }

    // 3. Valid construction
    @Test
    void shouldCreateGamingComputer() {
        Computer computer = new Computer.Builder(
                "Intel Core i7",
                32,
                1000,
                "Windows 11"
        )
                .withGraphicsCard("RTX 4070")
                .enableGamingMode()
                .withPrice(1800.0)
                .build();

        assertTrue(computer.isGamingMode());
        assertTrue(computer.hasDedicatedGraphics());
        assertEquals("RTX 4070", computer.getGpu());

        System.out.println("Gaming computer built successfully 🍌");
    }

    // 4. Invalid construction
    @Test
    void shouldRejectZeroRam() {
        assertThrows(IllegalArgumentException.class, () ->
                new Computer.Builder(
                        "Intel Core i3",
                        0,
                        256,
                        "Windows 11"
                ).build()
        );
    }

    // 5. Invalid construction
    @Test
    void shouldRejectZeroStorage() {
        assertThrows(IllegalArgumentException.class, () ->
                new Computer.Builder(
                        "Intel Core i3",
                        8,
                        0,
                        "Windows 11"
                ).build()
        );
    }

    // 6. Invalid construction
    @Test
    void shouldRejectNegativePrice() {
        assertThrows(IllegalArgumentException.class, () ->
                new Computer.Builder(
                        "Intel Core i5",
                        16,
                        512,
                        "Windows 11"
                )
                        .withPrice(-100.0)
                        .build()
        );
    }

    // 7. Boundary case
    @Test
    void shouldAcceptMinimumPositiveRam() {
        Computer computer = new Computer.Builder(
                "Intel Core i3",
                1,
                256,
                "Windows 11"
        ).build();

        assertEquals(1, computer.getRam());
    }

    // 8. Boundary case
    @Test
    void shouldAcceptGamingWithExactly16GbRam() {
        Computer computer = new Computer.Builder(
                "Intel Core i5",
                16,
                512,
                "Windows 11"
        )
                .withGraphicsCard("RTX 4060")
                .enableGamingMode()
                .build();

        assertEquals(16, computer.getRam());
        assertTrue(computer.isGamingMode());
    }

    // 9. Individual constraint
    @Test
    void gamingModeShouldRequireDedicatedGraphics() {
        assertThrows(IllegalStateException.class, () ->
                new Computer.Builder(
                        "Intel Core i7",
                        32,
                        1000,
                        "Windows 11"
                )
                        .enableGamingMode()
                        .build()
        );
    }

    // 10. Builder reuse / Product independence
    @Test
    void builtComputerShouldNotChangeWhenBuilderIsReused() {
        Computer.Builder builder = new Computer.Builder(
                "Intel Core i5",
                16,
                512,
                "Windows 11"
        );

        Computer firstComputer = builder
                .withPrice(700.0)
                .build();

        Computer secondComputer = builder
                .withPrice(900.0)
                .enableWiFi()
                .build();

        assertEquals(700.0, firstComputer.getPrice());
        assertFalse(firstComputer.hasWiFi());

        assertEquals(900.0, secondComputer.getPrice());
        assertTrue(secondComputer.hasWiFi());
    }
}