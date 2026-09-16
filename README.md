# Computer Configuration Builder

This project was created for Software Design Patterns Assignment 1.

The project demonstrates the Builder Design Pattern using a computer configuration system.

## Project Description

A `Computer` has required and optional properties.

Required properties:
- CPU
- RAM
- Storage
- Operating System

Optional properties include:
- Dedicated graphics card
- Wi-Fi
- Bluetooth
- Gaming mode
- Price
- Dimensions

The Builder Pattern makes it easier to create different computer configurations without using a large constructor with many parameters.

## Builder Pattern Structure

The project contains the following main classes:

- `Computer` – Product
- `Computer.Builder` – Builder
- `ComputerDirector` – Director
- `Main` – Client
- `Dimensions` – Value Object

## Presets

The Director provides three predefined configurations:

- BASIC
- OFFICE
- GAMING

The GAMING configuration must have at least 16 GB RAM and a dedicated graphics card.

## Validation

The Builder validates the configuration before creating a Computer object.

Validation includes:
- RAM must be greater than 0
- Storage must be greater than 0
- Price cannot be negative
- Gaming mode requires at least 16 GB RAM
- Gaming mode requires a dedicated graphics card

## Testing

The project uses JUnit 5.

There are 10 automated tests covering:
- Valid configurations
- Invalid configurations
- Boundary cases
- Gaming constraint
- Builder reuse and Product independence

All 10 tests pass successfully.

## UML Diagram

The Builder Pattern UML diagram is available here:

`docs/builder-uml.png`

## Technologies

- Java
- Maven
- JUnit 5
- IntelliJ IDEA

## How to Run

Run the `Main` class to see the BASIC, OFFICE, and GAMING computer configurations.

To run automated tests, run the `ComputerTest` class.

## Author

Software Design Patterns – Assignment 1