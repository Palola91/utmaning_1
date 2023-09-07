package org.example;

public class Main {
    public static void main(String[] args) {

        // Temperatur i Celsius
        double celsius = 25.0;

        // Omvandling till Fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;

        // Omvandling till Kelvin
        double kelvin = celsius + 273.15;

        // Resultat
        System.out.println("Temperatur i Celsius: " + celsius);
        System.out.println("Temperatur i Fahrenheit: " + fahrenheit);
        System.out.println("Temperatur i Kelvin: " + kelvin);

    }
}